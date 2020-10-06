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
		
		System.out.println("find the maximum number from 3 numbers");
		System.out.println("the number value a: ");
		int a = scan.nextInt();
		System.out.println("the number value b: ");
		int b = scan.nextInt();
		System.out.println("the number value c: ");
		int c = scan.nextInt();
		
		int max = a;
		if(a>b) {
			max = a;
		} else if (b > c){
			max = b;
		}
		
		System.out.println("the maximum value from a, b, c is "+max);
	}

}
