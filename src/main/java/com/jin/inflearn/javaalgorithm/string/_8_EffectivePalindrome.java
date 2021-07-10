/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 * Input: found7, time: study; yduts; emit, 7Dnuof
 * Output: YES
 */
public class _8_EffectivePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_8_EffectivePalindrome T = new _8_EffectivePalindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}

	public String solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); //정규식[^A-Z]: 대문자 A부터 Z까지가 아니면, "" 빈문자로 바꾼다
		System.out.println(str);
		String temp = new StringBuffer(str).reverse().toString();
		System.out.println(temp);
		if(str.equals(temp)) return "YES";
		return "No";
	}
}
