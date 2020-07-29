package net.jin.reomtecontrol.service.impl;

import net.jin.remotecontrol.service.RemoteControl;

public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	//Constructor
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
