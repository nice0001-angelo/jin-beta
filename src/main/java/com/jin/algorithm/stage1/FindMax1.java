package com.jin.algorithm.stage1;

import java.util.*;

public class FindMax1 {

	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		
		System.out.println("Input 1st Number; \n");
		int number1 = StdIn.nextInt();
		System.out.println("Input 2nd Number; \n");
		int number2 = StdIn.nextInt();
		System.out.println("Input 3rd Number; \n");
		int number3 = StdIn.nextInt();
		
		int result = findMax1(number1, number2, number3);
		System.out.println("Max is "+result);
		
	}

	private static int findMax1(int a, int b, int c) {
		int result = a;
		if(b > result) {
			result = b;
		} else if(c > result) {
			result = c;
		}
		return result;
	}

}
