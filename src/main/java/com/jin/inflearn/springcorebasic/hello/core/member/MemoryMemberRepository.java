/**
 * 
 */
package com.jin.inflearn.springcorebasic.hello.core.member;

import java.util.*;

import org.apache.catalina.*;

/**
 * @author njh
 *
 */
public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> Store = new HashMap<Long, Member>();
		
	@Override
	public void save(Member member) {
		// TODO Auto-generated method stub
		Store.put(member.getId(), member);
		
	}

	@Override
	public Member findById(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
