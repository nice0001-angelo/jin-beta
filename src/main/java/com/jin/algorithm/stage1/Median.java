/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class Median {

	/**
	 * @param args
	 */
	
	static int med3(int a, int b, int c) {
		try {
			if(a>=b) {
				if(b>=c) {
					return b;
				} else if(c>=a) {
					return a;
				} else {
					return c;
				}
			} else if(a>c){
				return a;
			} else if(b>c) {
				return c;
			} else {
				return b;
			}
		} catch (Exception e) {
			return -1;
		}
		}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi lovely Jee~! Finding the median from 3 numbers");
		System.out.println("Input the number a: ");
		int a = input.nextInt();
		System.out.println("The number a is: "+a);
		System.out.println("Input the number b: ");
		int b = input.nextInt();
		System.out.println("The number b is: "+b);
		System.out.println("Input the number c: ");
		int c = input.nextInt();
		System.out.println("The number c is: "+c);
		
		int result = med3(a,b,c);
		System.out.println("The median value is: "+result);
	}

}
