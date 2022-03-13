/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

import inflearn.springcorebasic.hello.core.discount.*;
import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class OrderServiceImpl implements OrderService{

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	//FixDiscountPolicy를 RateDicountPolicy로 변경하려면 OrderServiceImpl의 코드를 변경해야 한다. OCP 위반
	//역할과 구현을 구분해두면 휘발유차(구현체)를 전기차(구현체)로 바꾸어도 자동차운전(역할)을 바꾸면 안된다.
//	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
	private final DiscountPolicy discountPolicy = new RateDicountPolicy(); 
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
