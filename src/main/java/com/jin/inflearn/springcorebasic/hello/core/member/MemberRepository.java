/**
 * 
 */
package com.jin.inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 */
public interface MemberRepository {
	
	void save(Member member);
	
	Member findById(Long memberId);

}
