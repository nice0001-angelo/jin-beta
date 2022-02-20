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
		System.out.println("투표자수와 득표자의 알파벳을 입력하세요");
		_1_HashMapLeader T = new _1_HashMapLeader();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.Solution(n, str));
	}

	public char Solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		System.out.println("A 가 key 중의 하나인가: "+ map.containsKey('A'));
		System.out.println("Map의 key의 갯수는: "+map.size());
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
			if(map.get(key) > max) {
				max = map.get(key); // max에는 key에 해당하는 value의 값을 넣고
				answer = key; // key 자체를 리턴
			}
		}
		return answer;
	}
}
