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
	@Autowired
	RemoteControl remote;
	
	private int volume;
		
	@Override
	public void turnOn() {
		System.out.println("라디오 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 전원을 끕니다");
	}
	
	public void setVolume(int volume) {
		if(volume > remote.MAX_VOLUME) {
			this.volume= 10;
		}else if(volume < remote.MIN_VOLUME) {
			this.volume= 0;
		}else {
			this.volume= volume;
		}
		System.out.println("지금 라디오의 볼륨은: "+this.volume);
	}
}
