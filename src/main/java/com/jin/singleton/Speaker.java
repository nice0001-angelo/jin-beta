/**
 * 
 */
package com.jin.singleton;

/**
 * @author njh
 *
 */
public class Speaker {
	private static Speaker speaker = new Speaker();
	private int volume;
	
	private Speaker() {
		volume = 5;
	}

	public static Speaker getInstance() {
		return speaker;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
