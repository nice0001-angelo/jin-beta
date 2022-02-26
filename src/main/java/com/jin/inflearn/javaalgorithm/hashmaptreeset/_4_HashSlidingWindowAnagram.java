/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_HashSlidingWindowAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_HashSlidingWindowAnagram T = new _4_HashSlidingWindowAnagram();
		System.out.println("Please Enter Character for Anagram: Example: ㅁ===>");
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
	
	public int solution(String a, String b) {
		
		int answer = 0;
		
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		
		for(int i=0; i<b.length()-1; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		
		int lt=0;
		
		for(int rt=b.length()-1; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt)-1));
			lt++;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		return answer;
	}
}
