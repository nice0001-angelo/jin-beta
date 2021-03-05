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
		int no = 0;
		digits(no);
		// 연결되었습니다.//
	}

	private static void digits(int no) {

		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("Please input 2 diggits number(10~99)");
			System.out.println("Input: ");
			no = stdIn.nextInt(); 
		} while(!(no >= 10 && no <= 99));
		
		System.out.println("variable no's value is:  "+no);
		
	}

}
