/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */	
public class CalculatorUser1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
	
}
