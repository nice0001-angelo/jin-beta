/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _8_FindGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_8_FindGrade T = new _8_FindGrade();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		int cnt = 1;
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					cnt++;
				}
				
			}
			answer[i] = cnt;
			cnt = 1;
		}
		return answer;
	}
}
