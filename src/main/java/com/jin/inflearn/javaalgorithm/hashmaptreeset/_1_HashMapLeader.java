/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_HashMapLeader {

	/**
	 * @param args
	 * Input: 15
	 * Input: BACBACCACCBDEDE
	 * Output: C
	 */
	public static void main(String[] args) {
		_1_HashMapLeader T = new _1_HashMapLeader();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.Solution(n, str));
	}

	public char Solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1); //get은 key의 value값을 가져오는 것임. key의 value를 관리함으로써 count할때 요긴하게 쓸수 있음. (A, 2) 일때는 (A, 3)으로 update
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) { //keySet() key 집합을 리턴하는 method
			System.out.println(key+" "+map.get(key)); // get(key) key에 해당하는 value를 리턴하는 method
			if(map.get(key) > max) {
				max = map.get(key); //비교해서 가장 큰 value를 max에 넣고 Key를 리턴한다 
				answer = key;
			}
		} 
		return answer;
	}
}
