/**
 * 
 */
package com.jin.polymorphism;

import org.springframework.beans.factory.annotation.*;

/**
 * @author njh
 *
 */
public class Television implements RemoteControl{
	
	@Autowired
	RemoteControl remoteControl;
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > remoteControl.MAX_VOLUME) {
			this.volume = remoteControl.MAX_VOLUME;
		} else if(volume < remoteControl.MIN_VOLUME){
			this.volume = remoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비의 volume: "+this.volume);
	}
}
