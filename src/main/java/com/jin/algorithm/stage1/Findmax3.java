package com.jin.algorithm.stage1;

import java.util.*;

public class Findmax3 {

	public static void main(String[] args) {
		int max = 0; 
		int cnt = 5;
		int[] input = new int[cnt];
		
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Insert number1: ");
		input[0] = stdIn.nextInt();
		System.out.println("Insert number2: ");
		input[1] = stdIn.nextInt();
		System.out.println("Insert number3: ");
		input[2] = stdIn.nextInt();
		
		max = findMax3(input[0], input[1], input[2]);
		System.out.println("max is :"+max);
	}

	private static int findMax3(int i, int j, int k) {
		int result = i;
		if(j > result)	result = j;
		if(k > result)  result = k; 
		return result;
		
	}
	

}
