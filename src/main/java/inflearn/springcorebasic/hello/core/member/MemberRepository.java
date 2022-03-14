/**
 * 
 */
package inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 *<멤버 레파지토리>
 *
 */
public interface MemberRepository {

	void save(Member member);
	
	Member findById(Long memberId);
}
