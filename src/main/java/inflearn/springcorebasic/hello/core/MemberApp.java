/**
 * 
 */
package inflearn.springcorebasic.hello.core;

import inflearn.springcorebasic.hello.core.member.*;

/**
 * @author njh
 *
 */
public class MemberApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl();
		
		Member member = new Member(1L, "memberA", Grade.VIP);
		
		memberService.join(member);
		
		Member findMember = memberService.findMember(1L);
		
		System.out.println("new member ===> "+member);
		System.out.println("find Member ====> "+findMember);
		
		System.out.println("new member ===> "+member.getName());
		System.out.println("find Member ====> "+findMember.getName());

	}

}
