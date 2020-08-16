/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class InterruptMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new InterruptPrintThread1();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		thread.interrupt();
	}

}
