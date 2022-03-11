/**
 * 
 */
package com.jin.inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 */
public interface MemberService {
	
	void join(Member member);
	
	Member findMember(Long memberId);

}
