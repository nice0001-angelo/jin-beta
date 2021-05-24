/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _6_ReversePrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_6_ReversePrimeNumber T = new _6_ReversePrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, arr));
		
	}
	
	public ArrayList<String> solution(int n, int[] arr) {
		ArrayList<String> answer = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>0) {
				int t = tmp%10; //arr[0] 25이면 5
				res=res*10+t; //0*10+5=5
				tmp=tmp/10; // 25/10=2.5
			}
		}
		
		
		return answer;
	}

}
