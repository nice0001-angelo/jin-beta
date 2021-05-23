/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.*;

/**
 * @author njh
 *
 */
public class _2_VisibleStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_2_VisibleStudent T = new _2_VisibleStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
	
	public int solution(int n, int[] arr) {
		int answer = 1;
		
		return answer;
	}
}
