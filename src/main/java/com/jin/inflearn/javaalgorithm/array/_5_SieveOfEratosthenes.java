/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _5_SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_5_SieveOfEratosthenes T = new _5_SieveOfEratosthenes();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
	
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i = 2; i<=n; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j=i; j<=n; j++) {
					
				}
			}
		}
		
		return answer;
	}

}
