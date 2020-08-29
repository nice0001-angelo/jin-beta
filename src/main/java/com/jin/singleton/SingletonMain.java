/**
 * 
 */
package com.jin.singleton;

/**
 * @author njh/
 *
 */
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String...args) {
		//Singleton obj1 = new Singleton(); //private constructor

		//Singlton check good
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		Singleton obj3 = Singleton.getInstace();
		Singleton obj4 = Singleton.getInstace();
			
		
		if(obj1.equals(obj2)) {
			System.out.println("같은  Singleton 객체입니다");
		} else  {
			System.out.println("다른  Singleton 객체입니다");
		}
		
		obj1.print("obj1");
		obj2.print("obj2");
		obj3.print("obj3");
		obj4.print("obj4");
	}
}
