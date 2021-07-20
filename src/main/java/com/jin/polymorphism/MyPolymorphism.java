/**
 * 
 */
package com.jin.polymorphism;

/**
 * @author njh
 *
 */
public class MyPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.out.println("1)----------------------");
		
		MyController myController1 = new MyController();
		myController1.rc.turnOn();
		myController1.rc.setVolume(5);
				
		
		
		System.out.println("2)----------------------");
		
		MyController myController2 = new MyController(new Audio());
				
		
		
		System.out.println("3)----------------------");
		
		MyController myController3 = new MyController();
		myController3.methodA();
		
				
		
		System.out.println("4)----------------------");
		
		MyController myController4 = new MyController();
		myController4.methodB(new Television());

	}

}
