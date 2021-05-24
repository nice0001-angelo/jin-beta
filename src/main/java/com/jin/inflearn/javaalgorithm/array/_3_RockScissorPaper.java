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
		
		System.out.println(T.solution(n, a, b));
	}
	
	public int solution(int n, int[] a, int[] b) {
		
	}
}
