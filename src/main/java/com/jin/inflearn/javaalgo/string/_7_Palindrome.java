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
		//String answer = new String();
		String upstr = str.toUpperCase();
		int rt = upstr.length()-1;
		for (int lt = 0 ; lt < upstr.length()/2; lt++) {
			if(str.charAt(lt) == str.charAt(rt)) {
				rt--;
		    } else {
		    	return "N0";
		    }
		}
		return "YES";
	}
}
