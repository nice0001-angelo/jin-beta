/**
 * 
 */
package com.jin.polymorphism;

/**
 * @author njh
 *
 */
public class MyController {
	RemoteControl rc = new Television();
	
	//생성자
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자(아규먼트로 넣어서 객체 주입함)
	MyController(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(6);
	}
	
	//MethodA: New Audio 객체 주입
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//MethodB: 메서드에 객체주입과 동시에 넣음
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(4);
	}
	
}
