/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class StopFlagMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopFlagPrintThread1 stopFlagPrintThread = new StopFlagPrintThread1();
		stopFlagPrintThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		stopFlagPrintThread.setStop(true);

	}

}
