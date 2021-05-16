/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _7_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_7_Palindrome T = new _7_Palindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = new String();
		String upstr = str.toUpperCase();
		int lt = 0, rt = upstr.length();
		while(rt > lt) {
			String tmp = upstr.valueOf(lt);
			upstr.valueOf(lt) = upstr.valueOf(rt);
			
		}
		return answer;
	}

}
