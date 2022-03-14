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

	//MemberRepository memberRepository = new MemoryMemberRepository();
	private final MemberRepository memberRepository;
	
	
	//AppConfig를 통해서 접근 가능하도록 생성자를 만들었음
	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
