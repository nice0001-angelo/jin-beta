/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_BigNumPrint {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { _1_BigNumPrint T = new
	 * _1_BigNumPrint(); Scanner kb = new Scanner(System.in); int n = kb.nextInt();
	 * int[] arr = new int[n]; for(int i=0; i < n; i++) { arr[i] = kb.nextInt(); }
	 * for(int x : T.solution(n, arr)) { System.out.println(x+" "); }
	 * System.out.println();
	 * 
	 * }
	 * 
	 * public ArrayList<Integer> solution(int n, int[] arr) { //ArrayList
	 * ArrayList<Integer> answer = new ArrayList<>(); answer.add(arr[0]); for(int i
	 * = 1; i < n; i++) { if(arr[i] > arr[i-1] ) { answer.add(arr[i]); } } return
	 * answer; }
	 */
	
	public static void main(String[] args) {
		_1_BigNumPrint T = new _1_BigNumPrint();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.println(x);
		}
		
	
		
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(arr[0]); 
		for(int i=1; i<n; i++) {
			if(arr[i+1]>arr[i]) arrayList.add(arr[i+1]);
		}
		return arrayList;
	}
}
