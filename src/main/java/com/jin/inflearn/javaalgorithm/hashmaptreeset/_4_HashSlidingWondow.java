/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_HashSlidingWondow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_HashSlidingWondow T = new _4_HashSlidingWondow();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
	}
	
	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0)+1);
			System.out.println();
			System.out.print(b);
			System.out.println();
			System.out.println();
		}
		return 0;
	}

}
