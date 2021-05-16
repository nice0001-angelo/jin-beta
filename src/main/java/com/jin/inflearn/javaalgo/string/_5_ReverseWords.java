/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _5_ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_5_ReverseWords T = new _5_ReverseWords();
		Scanner kb = new Scanner(System.in);
		//String str = kb.nextLine();
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length();
		while(rt > lt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = s.toString();
		return answer;	
		}
}

