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
	
	//구현체에서 직접 인터페이스에 접근하지 않게 하자(MemberService에 MemberServiceImpl이 접근할때 생성자를 통해서 접근하도록 세팅해 줌
	public MemberService memberService() {
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	//구현체에서 직접 인터페이스에 접근하지 않게 하자(OrderService에 OrderServiceImpl이 접근할때 생성자를 통해서 접근하도록 세팅해 줌
	public OrderService orderService() {
		return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
	}
}
