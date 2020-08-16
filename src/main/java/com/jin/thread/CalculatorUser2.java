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

	public void setcalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
    
	public void run() {
		calculator.setMemory(50);
	}
}
