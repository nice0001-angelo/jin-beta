/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 *<맴버 서비스 구현체>
 *
 */
public class MemberServiceImpl implements MemberService{

	MemberRepository memberRepository = new MemoryMemberRepository();
	
	@Override
	public void join(Member member) {
		memberRepository.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
