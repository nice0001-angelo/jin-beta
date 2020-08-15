/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 * 2020.Aug
 */
public class NameThreadA extends Thread {
	public NameThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}

}
