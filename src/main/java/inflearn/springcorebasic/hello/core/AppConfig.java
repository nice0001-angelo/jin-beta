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
