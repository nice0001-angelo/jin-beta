/**
 * 
 */
package inflearn.springcorebasic.hello.core;

import inflearn.springcorebasic.hello.core.member.*;
import inflearn.springcorebasic.hello.core.order.*;

/**
 * @author njh
 *
 */
public class OrderApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		MemberService memberService = new MemberServiceImpl(null);
//		OrderService orderService = new OrderServiceImpl(null,null);
		
		AppConfig appConfig = new AppConfig();
		
		
		Long memberId = 1L;
		
		Member member = new Member(memberId, "memberA", Grade.VIP);
				
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemA", 10000);
		
		System.out.println("Order ==> "+order);
		System.out.println("calculatePrice ==> "+order.calculatePrice());

	}

}
