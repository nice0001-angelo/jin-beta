/**
 * 
 */
package com.jin.algorithm.stage2;

import java.util.*;

/**
 * @author njh
 *
 */
public class MaxOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Finding max number: ");
		System.out.println("Input Number of Person: ");
		int num = stdIn.nextInt(); //배열의 요솟수를 입력 받음
		
		int[] height = new int[num]; //요솟수가 num인 배열을 생성
		
		for(int i=0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("Maximum value:"+maxOf(height));
		
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

}
