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
		int stnum = kb.nextInt();
		int testnum = kb.nextInt();
		int[][] arr = new int[testnum][stnum];
		for(int i=0; i<testnum; i++) {
			for(int j=0; j<stnum; j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println(T.solution(stnum, testnum, arr));
	}
	
	public int solution(int stnum, int testnum, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<stnum; i++) {
			for(int j=0; j<stnum; j++) {
				
			}
		}
		return answer;
		
	}

}
