/**
 * 
 */
package com.jin.singleton;

/**
 * @author njh
 *
 */
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); //private constructor
		
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton 객체입니다");
		} else {
			System.out.println("다른 Singleton 객체입니다");
		}
	}

}
