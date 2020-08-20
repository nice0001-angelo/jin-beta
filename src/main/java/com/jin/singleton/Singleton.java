/**
 * 
 */
package com.jin.singleton;

/**
 * @author njh
 *
 */
public class Singleton {
	private Static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
			
	Static Singleton getInstace() {
		return singleton;
	}
}
