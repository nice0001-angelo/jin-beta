/**
 * 
 */
package inflearn.springcorebasic.hello.core.discount;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
class RateDicountPolicyTest {

	RateDicountPolicy discountPolicy = new RateDicountPolicy();
	
	@Test
	@DisplayName("VIP는 10% 할인이 적용 되어야 한다")
	void test_o() {
		//given
		Member member = new Member(1L, "memberVIP", Grade.VIP);
		
		//when
		int discount = discountPolicy.discount(member, 10000);
		
		//then
		Assertions.assertThat(discount).isEqualTo(1000);
	}

	@Test
	@DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다")
	void test_f() {
		//given
		Member member = new Member(2L, "memberBASIC", Grade.BASIC);
		
		//when
		int discount = discountPolicy.discount(member, 10000);
		
		//then
		Assertions.assertThat(discount).isEqualTo(0);
	}
}
