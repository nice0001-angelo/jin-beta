/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _11_Mentoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_11_Mentoring T = new _11_Mentoring();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
	}
	
	public int solution(int n, int m, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		return answer;
		
	}

}
