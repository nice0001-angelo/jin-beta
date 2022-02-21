/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _3_HashSlidingWindow {

	/**
	 * @param args
	 * Input: 7 4 (총 매출기간이 7일이고 그중에서 4일간의 연속된 일자의 매출액의 종류를 구하시오)
	 * Input: 20 12 20 10 23 17 10
	 * Output: 3 4 4 3
	 * SlidingWindow에 대해서 사전 지식 있어야 함
	 */
	public static void main(String[] args) {
		_3_HashSlidingWindow T = new _3_HashSlidingWindow();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int[] arr = new int[a];
		for(int i=0; i<arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.Solution(a, b, arr));
	}
	
	public ArrayList<Integer> Solution(int a, int b, int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0; i<b-1; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=b-1; rt<a; rt++) {
			hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0)+1);
			arrayList.add(hashMap.size());
			hashMap.put(arr[lt], hashMap.get(arr[lt])-1);
			if(hashMap.get(arr[lt])==0) hashMap.remove(arr[lt]);
			lt++;
		}
		return arrayList;
	}
}
