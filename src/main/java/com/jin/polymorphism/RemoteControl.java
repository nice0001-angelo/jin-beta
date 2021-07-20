/**
 * 
 */
package com.jin.polymorphism;

/**
 * @author njh
 *
 */
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volue);
}
