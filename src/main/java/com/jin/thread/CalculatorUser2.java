/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class CalculatorUser2 extends Thread{
	private Calculator calculator;

	public void setCalculastor(Calculator calculastor) {
		this.setName("User2");
		this.calculator = calculastor;
	}
    
	public void run() {
		calculator.setMemory(50);
	}
}
