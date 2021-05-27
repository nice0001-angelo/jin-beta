/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_FindBoss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_10_FindBoss T = new _10_FindBoss();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
		

	}
	
	public int solution(int n, int[][] arr) {
		int answer=0, max=Integer.MAX_VALUE;
		return answer;
	}

}
