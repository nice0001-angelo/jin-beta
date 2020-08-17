/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class InterruptPrintThread1 extends Thread{
	public void run() {
		//try {
			while (true) {
				//Thread.sleep(1);
			//}
		//} catch (InterruptedException e) {
			// TODO: handle exception
				System.out.println("실행 중");
				if(Thread.interrupted()) {
					break;
				}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
