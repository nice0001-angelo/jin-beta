/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 *<맴버 서비스 인터페이스>
 */
public interface MemberService {
	
	void join(Member member);
	
	Member findMember(Long memberId); 
}
