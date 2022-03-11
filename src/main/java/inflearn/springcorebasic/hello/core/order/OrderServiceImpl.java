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
	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice, int discountPrice) {
		// TODO Auto-generated method stub
		return null;
	}
}
