/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

import org.hibernate.mapping.*;

/**
 * @author njh
 *
 */
public class _3_RockScissorPaper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_3_RockScissorPaper T = new _3_RockScissorPaper();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, a, b).);
	}
	
	// 1. Scissor 2.Rock 3.Paper
	public String[] solution(int n, int[] a, int[] b) {
		String[] answer = new String[n]; 
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				answer[i] = "D";
			} else if(a[i] == 1 && b[i] == 2) {
				answer[i] = "B";
			} else if(a[i] == 2 && b[i] == 3) {
				answer[i] = "B";
			} else if(a[i] == 3 && b[i] == 1) {
				answer[i] = "B";
			} else {
				answer[i] = "A";
			}
		}
		return answer;
	}
}
