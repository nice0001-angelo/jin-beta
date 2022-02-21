/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 * 매출액의 종류(HashMap, Sliding Window)
 */
public class _3_HashSlidingWindow {

	/**
	 * @param args
	 * Instruction: 7 4 (총 매출기간이 7일이고 그중에서 4일간의 연속된 일자의 매출액의 종류를 구하시오)
	 * Input: 7 4         20 12 20 10 23 17 10
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
		
		int lt=0;
		
		//hashMap에 arr 값 넣기(b-1 자리수 전까지, cf b-1 자리는 rt의 자리
		for(int i=0; i<b-1; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}
		
        //Sliding Window: 초기 lt=0, rt=b-1  ==> b가 4라면 lt=0, rt=3(총 4자리) 윈도우를 만들고 오른쪽으로 슬라이딩 시키는 로직
		for(int rt=b-1; rt<a; rt++) {
			hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0)+1);
			
			arrayList.add(hashMap.size());
		}
		
		
		for(int rt=b-1; rt<a; rt++) {
			//rt의 key, value 세팅
			hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0)+1);
			
			//key의 갯수 측정
			arrayList.add(hashMap.size()); 
			
			//lt의 value -1, lt의 값 슬라이딩 전처리,,
			hashMap.put(arr[lt], hashMap.get(arr[lt])-1);
			
			//lt의 value -1 후에 value가 0 가 되면 해당 key 삭제
			if(hashMap.get(arr[lt])==0) hashMap.remove(arr[lt]);
			
			//lt 위치 오른쪽으로 sliding
			lt++;
		}
		return arrayList;
	}
}
