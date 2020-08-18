/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class DemonMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemonAutoSaveThread demonAutoSaveThread = new DemonAutoSaveThread();
		demonAutoSaveThread.setDaemon(true);
		demonAutoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("메인 스레드 종료");
		}
	}
