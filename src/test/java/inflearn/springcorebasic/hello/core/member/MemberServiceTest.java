/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

/**
 * @author njh
 *
 */
public class MemberServiceTest {
	
	MemberService memberService = new MemberServiceImpl();
	
	@Test
	void join() {
		//given
		Member member = new Member(1L, "memberA", Grade.VIP);
		
		
		//when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		
		
		//then: Userful org.assertj.core.api 
		Assertions.assertThat(member).isEqualTo(findMember);
	}

}
