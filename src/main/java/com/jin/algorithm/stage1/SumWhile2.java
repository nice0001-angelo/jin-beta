package com.jin.algorithm.stage1;

import java.util.*;

public class SumWhile2 {

	public static void main(String[] args) {
		int result = 0;
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.println("Input n value: ");
			int input = stdIn.nextInt(); 
			result = sumWhile2(input);
			System.out.println("The Sum from 1 to " +input+ "is" + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static int sumWhile2(int input) {
		int result = 0;
		if(input == 0) {
			result = 1;
		} else {
		try {
			int i = 0;
			while (i < input) {
				i = i + 1;
				result = result + i;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		return result;
	}	
}
