package com.jin.algorithm.stage1;

import java.util.*;

public class Median2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Input 3 number: ");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		System.out.println("the midian number is: "+median2(a, b, c));
	}

	private static int median2(int a, int b, int c) {
		int mid = a;
		if (b > mid) {
			if(c > b) {
				mid = b;
			} else if(c > mid) {
				mid = c;
			}
		}
		return mid;
	}

}
