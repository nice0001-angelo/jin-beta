/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class Digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int no;

		System.out.println("Please input 2 diggits number");
		
		digits(int no);

	}

	private static void digits(int no) {

		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("Input: ");
			no = stdIn.nextInt(); 
		}
		
	}

}
