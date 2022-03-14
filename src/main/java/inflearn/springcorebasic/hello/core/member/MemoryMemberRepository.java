/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

import java.util.*;

/**
 * @author njh
 *
 *<매모리 멤버 레파지토리>
 *
 */
public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> store = new HashMap<Long, Member>();
	
	@Override
	public void save(Member member) {
		store.put(member.getId(), member);;
	}

	@Override
	public Member findById(Long memberId) {
		return store.get(memberId);
	}
}
