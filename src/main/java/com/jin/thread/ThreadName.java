/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class ThreadName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드 이름: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 쓰레드 이름: " + threadA.getName());
		threadA.start();
	}

}
