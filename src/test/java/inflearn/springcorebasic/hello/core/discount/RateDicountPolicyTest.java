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
	void test() {
		//given
		Member member = new Member(1L, "memberVIP", Grade.VIP);
		
		//when
		int discount = discountPolicy.discount(member, 10000);
		
		//then
		Assertions.assertThat(discount).isEqualTo(1000);
	}

}
