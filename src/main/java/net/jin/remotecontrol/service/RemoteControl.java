package net.jin.remotecontrol.service;

public interface RemoteControl {
	//Constant field
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//Abstract Method
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolumn();
}
