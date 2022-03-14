/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 *<맴버 서비스 구현체>
 *
 *
 *설계변경으로MemberServiceImpl은MemoryMemberRepository를의존하지않는다!단지MemberRepository 인터페이스만의존한다.
	MemberServiceImpl입장에서생성자를통해어떤구현객체가들어올지(주입될지)는알수없다. MemberServiceImpl의생성자를통해서어떤구현객체를주입할지는오직외부( AppConfig)에서 결정된다.
	MemberServiceImpl은이제부터의존관계에대한고민은외부에맡기고실행에만집중하면된다.

 */
public class MemberServiceImpl implements MemberService{

	//MemberRepository memberRepository = new MemoryMemberRepository();
	private final MemberRepository memberRepository;
	
	
	//AppConfig를 통해서 MemberServiceImpl 클래스의 필드에 접근 가능하도록 생성자를 만들었음
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
