/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class CalculatorUser2 extends Thread{
	private Calculator calculastor;

	public void setCalculastor(Calculator calculastor) {
		this.setName("User2");
		this.calculastor = calculastor;
	}
    
	public void run() {
		calculastor.setMemory(50);
	}
}
