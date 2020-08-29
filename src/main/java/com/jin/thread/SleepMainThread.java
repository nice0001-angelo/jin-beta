/**
 * 
 */
package com.jin.thread;

import java.awt.*;

/**
 * @author njh
 *
 */
public class SleepMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	
	}

}
