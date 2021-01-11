/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class SumFor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("I will show you the sum from 1 to n");
			System.out.println("Please Enter the n: ");
			n = input.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(e.getMessage().equals("null")) {
				System.out.println("Please Enter the number");
			}
		}
		
		
		try {
			for(int i=1; i<=n; i++) {
				sum = sum+i;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("The sum from 1 to "+n+" is "+sum);
	}

}
