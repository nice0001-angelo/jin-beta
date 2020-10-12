/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class Max3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Find the maximum number from 3 numbers");
		System.out.println(" The number value a: ");
		int a = scan.nextInt();
		System.out.println(" The value a is: "+a);
		
		System.out.println(" The number value b: ");
		int b = scan.nextInt();
		System.out.println(" The value b is: "+b);
		
		System.out.println(" The number value c: ");
		int c = scan.nextInt();
		System.out.println(" The value c is: "+c);
		
		int max = max3(a,b,c);

        System.out.println("\n The maximum value from a, b, c is "+max);

	}
	
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(a>b) {
			max = a;
		} else if (b > c){
			max = b;
		} else {
			max = c;
		}
		
		return max;
		
//		System.out.println(" The value of a: "+a+
//				"\n The value of b: "+b+
//				"\n The value of c: "+c+
//				"\n The maximum value from a, b, c is "+max);
	}

}
