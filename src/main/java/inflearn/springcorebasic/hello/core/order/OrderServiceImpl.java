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
//	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
	private final DiscountPolicy discountPolicy = new RateDicountPolicy(); //DIP 위배 구현체에도 의존하고 있다
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
