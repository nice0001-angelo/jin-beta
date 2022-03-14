/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

import inflearn.springcorebasic.hello.core.discount.*;
import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh

<주문 구현체>
 *
DIP : 의존 역전 원칙 

"고차원 모듈은 저차원 모듈에 의존하면 안된다. 이 두 모듈 모두 다른 추상화된 것에 의존해야 한다."

"추상화된 것은 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화된 것에 의존해야 한다."

"자주 변경되는 구체(Concrete) 클래스에 의존하지 마라"              

"자신보다 변하기 쉬운 것에 의존하지 마라"

- 로버트 C 마틴



OCP - 개방 폐쇄 원칙

"소프트위어 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만 변경에 대해서는 닫혀 있어야 한다. - 로버트 C 마틴" 

 *
 */

public class OrderServiceImpl implements OrderService{

	//FixDiscountPolicy를 RateDicountPolicy로 변경하려면 OrderServiceImpl의 코드를 변경해야 한다. OCP 위반
	//역할과 구현을 구분해두면 휘발유차(구현체)를 전기차(구현체)로 바꾸어도 자동차운전(역할)을 바꾸면 안된다.
//	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//	private final DiscountPolicy discountPolicy = new RateDicountPolicy();
//  해결방안: 이 문제를 해결하려면 누군가가 클라이언트 OrderServiceImpl에 	discountPolicy 구현 객체를 대신 생성하고 주입해줘야 한다
//	private final MemberRepository memberRepository = new MemoryMemberRepository();

	private final MemberRepository memberRepository;
	private DiscountPolicy discountPolicy; // 이렇게만 해두면 DIP는 지켰으나 Nullpoint Exception 발생한다
	
	//AppConfig를 통해서 OrderServiceImpl class 의 field에 접근하도록 생성자를 만든다: OCP, DIP를 위배 하지 않기 위해서 만든다
	public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
		super();
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
	}

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
