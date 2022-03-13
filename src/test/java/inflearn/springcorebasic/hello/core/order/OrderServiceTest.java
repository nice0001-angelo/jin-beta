/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class OrderServiceTest {
	
	MemberService memberService = new MemberServiceImpl();
	OrderService orderService = new OrderServiceImpl();
	
	@Test
	void creatOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId, "memberA",Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemA", 10000);
		
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
		
		System.out.println();
	}
}
