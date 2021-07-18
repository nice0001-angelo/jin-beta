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
	 * Input: AbaAeCe
	 * Input: baeeACA
	 * Output: YES
	 * 
	 * Input: abaCC
	 * Input: CaaaB
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
		String Answer = "YES";
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		
		return Answer;
	}
}
