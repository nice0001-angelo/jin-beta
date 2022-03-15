/**
 * 
 */
package inflearn.springcorebasic.hello.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.*;

import inflearn.springcorebasic.hello.core.*;
import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class OrderServiceTest {
	
//	MemberService memberService = new MemberServiceImpl();
//	OrderService orderService = new OrderServiceImpl();
	
//	AppConfig appConfig = new AppConfig();
//	
//	MemberService memberService = appConfig.memberService();
//	OrderService orderService = appConfig.orderService();
	
	MemberService memberService;
	OrderService orderService;
	
	@BeforeEach
	public void BeforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}
	
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
