/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 * Input
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 * Output
 * 143
 * 
 * 중복 제거 위해서는,, 긜고 Treeset는 정렬까지 해줌 ==> 결론 정렬+중복제거 ==> TreeSet
 * Input : 총 숫자갯수(n=10)와 뽑아서 합을 구해야 하는 숫자갯수(k=3)
 * Input : 총 숫자  Array
 * 
 */
public class _5_BigNumberK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		_5_BigNumberK T = new _5_BigNumberK();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 총 숫자 갯수
		int k = kb.nextInt(); // 합을 구해야하는 숫자 갯수
		
		int[] arr = new int[n]; //실제 숫자 array 선언
		
		//Array 입력
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		T.solution(n,k,arr);

	}
	
	
	public int solution(int n,  int k, int arr[]) {
		int answer = 0;
		System.out.println();
		System.out.println();
		return answer;
		
	}

}
