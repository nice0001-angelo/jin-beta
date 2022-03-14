/**
 * 
 */
package inflearn.springcorebasic.hello.core;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class AppConfig {
	
	public MemberService memberService() {
		return MemberServiceImpl(new MemoryMemberRepository());
	}

}
