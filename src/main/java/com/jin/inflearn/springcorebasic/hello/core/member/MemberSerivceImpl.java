/**
 * 
 */
package com.jin.inflearn.springcorebasic.hello.core.member;

/**
 * @author njh
 *
 */
public class MemberSerivceImpl implements MemberService{

	//private MemberRepository memberRepository; //이걸로 하면 ovrride 된게 아니라 인터페이스에 있는게 호출되므로 아무 처리를 못한다. 나중에 해봐라
	private MemberRepository memberRepository = new MemoryMemberRepository();// 구현체를 넣어줘야 Null Point Exception이 안 생긴다?????
	
	@Override
	public void join(Member member) {
		memberRepository.save(member);		
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
