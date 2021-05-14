/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _2_ToUpperLowerCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_2_ToUpperLowerCase T = new _2_ToUpperLowerCase();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			//if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			
			//대문자 ASCII 65~90, 소문자 ASCII 97~122
			
			//else answer += Character.toLowerCase(x);
			
		}
		return answer;
	}
}
