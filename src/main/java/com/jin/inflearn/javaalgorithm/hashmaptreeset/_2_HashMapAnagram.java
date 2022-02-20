/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _2_HashMapAnagram {

	/**
	 * @param args
	 * Input: AbaAeCe baeeACA
	 * Output: YES
	 * 
	 * Input: abaCC CaaaB
	 * Output: NO
	 */
	public static void main(String[] args) {
		_2_HashMapAnagram T = new _2_HashMapAnagram();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.Solution(a, b));
	}

	public String Solution(String a, String b) {
//		String Answer = "YES";
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		System.out.println(map.entrySet());
//		for(char c : a.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//			System.out.println(map.entrySet());
//		}
//		for(char c : b.toCharArray()) {
//			if(!map.containsKey(c) || map.get(c) == 0) { //String a에 b의 원소가 없거나  value의 값이 0 이면 추가로 빼봐야 갯수가 b에 더 많은 것이기 때문에 "NO" 임 차근차근 그려보면 앎
//				return "NO";
//			} else {
//			    map.put(c, map.get(c)-1);
//			}
//		}
//		return Answer;
		
		String answer = "Yes";

		HashMap<Character, Integer> aHashMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bHashMap = new HashMap<Character, Integer>();
		
		if(a.length()!=b.length()) answer = "No";
		
		for(char x : a.toCharArray()) {
			aHashMap.put(x, aHashMap.getOrDefault(x, 0)+1);
		}
		 
		
		return answer;
	}
}
