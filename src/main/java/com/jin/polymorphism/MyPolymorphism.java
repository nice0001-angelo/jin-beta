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
		
		//기본 생성자: 예상 TV
		MyController myController1 = new MyController();
		myController1.rc.turnOn();
		myController1.rc.setVolume(7);
				
		
		
		System.out.println("2)----------------------");
		
		//생성자 객체주입: 예상 Audio
		MyController myController2 = new MyController(new Audio());
				
		
		
		System.out.println("3)----------------------");
		
		//메소드 A: 메소드 A에 사전 정의 되어 있는데로 객체주입 : 예상 Audio
		MyController myController3 = new MyController();
		myController3.methodA();
		
				
		
		System.out.println("4)----------------------");
		
		//메소드 B 객체주입: 예상 TV
		MyController myController4 = new MyController();
		myController4.methodB(new Television());

	}

}
