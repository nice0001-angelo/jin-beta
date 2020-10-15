/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class SumWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("From 1 to n sum");
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		
		int sum = 0;
		int i = 1;		
		
		try {
			while(i<=n) {
				sum = sum+i;
				i++;
			}
			System.out.println("The sum from 1 to "+n+" is "+sum);
		} catch (Exception e) {
		}
	}

}
