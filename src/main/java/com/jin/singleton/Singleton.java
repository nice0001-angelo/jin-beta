/**
 * 
 */
package com.jin.singleton;

/**
 * @author njh
 *
 */
public class Singleton {
	//private: can't access
	//static member: field
	private static Singleton singleton = new Singleton();
	private int count = 0;
	
	//private: can't access Constructor
	private Singleton() {
	}
	
	//static member: method
	static Singleton getInstace() {
		return singleton;
	}
	
	public void print(String input) {
		count++;
		System.out.println(input+"count: "+count);
	}
}