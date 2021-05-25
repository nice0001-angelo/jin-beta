/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_CountPeak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_10_CountPeak T = new _10_CountPeak();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n]; //0 으로 초기화
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n,arr));
	}
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		return answer;
	}

}
