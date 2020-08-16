/**
 * 
 */
package com.jin.thread;

/**
 * @author njh
 *
 */
public class CalculatorMainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		CalculatorUser1 calculatorUser1 = new CalculatorUser1();
		calculatorUser1.setCalculator(calculator);
		calculatorUser1.start();

	}

}
