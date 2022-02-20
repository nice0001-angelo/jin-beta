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
		char answer=' ';
		
		for(char x : str.toCharArray()) {
			HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
			hashMap.put(x, hashMap.getOrDefault(x, 0)+1); //hashMap 객체에 key와 key의 Value를 넣는다
		}
		return answer;
	}
}
