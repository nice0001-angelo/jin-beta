/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _9_MaxSumNbyNArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_9_MaxSumNbyNArray T = new _9_MaxSumNbyNArray();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));

	}
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		return answer;
	}

}
