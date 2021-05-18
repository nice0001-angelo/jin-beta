/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_BigNumPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_1_BigNumPrint T = new _1_BigNumPrint();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < n; i++) {
			arr[i] = kb.nextInt(); 
		}
		for(int x : T.solution(n, arr)) {
			System.out.println(x+" ");			
		}
		
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
	}
}
