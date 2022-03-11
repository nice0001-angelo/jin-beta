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

	private static Map<Long, Member> store = new HashMap<Long, Member>();
		
	@Override
	public void save(Member member) {
		store.put(member.getId(), member);
		
	}

	@Override
	public Member findById(Long memberId) {
		return store.get(memberId);
	}
	
}
