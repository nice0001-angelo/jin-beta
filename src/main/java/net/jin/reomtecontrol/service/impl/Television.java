package net.jin.reomtecontrol.service.impl;

import net.jin.remotecontrol.service.RemoteControl;

public class Television implements RemoteControl{
	//field
	private int volume;
	
    @Override
	public void turnOn() {
    	System.out.println("TV를 켭니다");
    }
    
    public void turnOff() {
    	System.out.println("TV를 끕니다");
    }
    
    public void setVolume(int Volume) {
    	
    }

}
