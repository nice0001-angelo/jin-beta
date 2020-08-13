/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 * 2020.Aug
 */
public class ThreadB extends Thread{
	
	//setName() 하지 않으면 자동으로 이름이 Thread-n 형태로 대입된다
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
