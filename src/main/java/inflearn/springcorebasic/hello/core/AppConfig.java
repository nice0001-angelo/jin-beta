/**
 * 
 */
package inflearn.springcorebasic.hello.core;

import inflearn.springcorebasic.hello.core.discount.*;
import inflearn.springcorebasic.hello.core.member.*;
import inflearn.springcorebasic.hello.core.order.*;

/**
 * @author njh
 * DIP, OCP를 해결하기 위한 클래스
 * 
 * 
 * AppConfig는애플리케이션의실제동작에필요한구현객체를생성한다.
	MemberServiceImpl MemoryMemberRepository OrderServiceImpl
	FixDiscountPolicy
   
   AppConfig는생성한객체인스턴스의참조(레퍼런스)를생성자를통해서주입(연결)해준다.
	MemberServiceImpl   MemoryMemberRepository
	OrderServiceImpl   MemoryMemberRepository, FixDiscountPolicy
	
	
	

 */
public class AppConfig {
	
	//구현체는 해당 인터페이스에만 접근하고 다른 구현체에 접근하지 않게 하자 즉 MemberServiceImpl 에서는 memberService 만 신경쓰게 하고
	//다른 구현체와의 관계는 AppConfig에서 접근하도록(생성자 이용:MemberServiceImpl에 필드 및 생성자를 만들어서 관계를 맺게 한다)
	public MemberService memberService() {
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	//구현체에서 해당 인터페이스에만 접근하고 다른 구현체에 접근하지 않게 하자 즉 OrderServiceImpl는 해당 인터페이스인 orderService 만 접근하게 하고
	//다른 구현체와의 관계는 AppConfig에서 접근하도록(생성자 이용: OrderServiceImpl에 필드 및 생성자를 만들어서 관계를 맺게 한다)
	public OrderService orderService() {
		return new OrderServiceImpl(new MemoryMemberRepository(), discountPolicy());
	}
	
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
	
	public DiscountPolicy discountPolicy() {
		//return new FixDiscountPolicy();
		return new RateDicountPolicy();
	}
}
