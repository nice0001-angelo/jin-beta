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
		int rt = str.length()-1;
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
		//answer = s.toString(); //s의 주소값이 그대로 스트링으로 리턴
		answer = String.valueOf(s); //s의 실제 값이 리턴
		return answer;	
		}
}

