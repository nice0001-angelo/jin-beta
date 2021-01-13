package com.jin.algorithm.stage1;

import java.util.*;

public class SumFor2 {

	public static void main(String[] args) {
		try {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("Please input the number n: \n");
			int input = stdIn.nextInt();
			int result = sumFor2(input);
			
			System.out.println("the sum from 1 to "+input+" is : "+result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static int sumFor2(int input) {
		int result = 0;
		for(int i=0; i<input; i++) {
			result = result+i;
		}
		return result;
	}
}

