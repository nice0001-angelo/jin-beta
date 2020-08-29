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
	
	private Speaker() {
	}

	private static Speaker getInstance() {
		return speaker;
	}
}
