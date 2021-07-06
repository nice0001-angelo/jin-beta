/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _2_ToUpperLowerCase {

	/**
	 * @param args
	 * Input: stuDY
	 * Output: STUdy
	 * 대문자 ASCII 65~90, 소문자 ASCII 97~122 (소문자에서 32를 빼면 대문자가 됨)
	 * if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
	 */
	public static void main(String[] args) {
		_2_ToUpperLowerCase T = new _2_ToUpperLowerCase();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

	public String solution(String str) {

	}
}
