/**
 * 
 */
package com.jin.polymorphism;

import org.springframework.beans.factory.annotation.*;

/**
 * @author njh
 *
 */
public class Audio implements RemoteControl{
	private int volume;
	
	@Autowired
	RemoteControl remote;
	
	@Override
	public void turnOn() {
		System.out.println("라디오 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 전원을 끕니다");
	}
}
