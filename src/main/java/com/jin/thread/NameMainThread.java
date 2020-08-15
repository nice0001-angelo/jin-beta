/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class NameMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드 이름: "+mainThread.getName());
		
		NameThreadA threadA = new NameThreadA();
		System.out.println("작업 쓰레드 이름: " + threadA.getName());
		threadA.start();
		
		NameThreadB threadB = new NameThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
