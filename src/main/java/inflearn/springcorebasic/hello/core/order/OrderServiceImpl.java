/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

import inflearn.springcorebasic.hello.core.discount.*;
import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh

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

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	//FixDiscountPolicy를 RateDicountPolicy로 변경하려면 OrderServiceImpl의 코드를 변경해야 한다. OCP 위반
	//역할과 구현을 구분해두면 휘발유차(구현체)를 전기차(구현체)로 바꾸어도 자동차운전(역할)을 바꾸면 안된다.
//	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//	private final DiscountPolicy discountPolicy = new RateDicountPolicy();
	private DiscountPolicy discountPolicy;
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
