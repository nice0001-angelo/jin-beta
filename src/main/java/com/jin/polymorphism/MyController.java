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
	
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	MyController(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
}
