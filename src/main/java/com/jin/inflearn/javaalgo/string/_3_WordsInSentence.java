/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _3_WordsInSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_3_WordsInSentence T = new _3_WordsInSentence();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}
	
	public String solution(String str) {
		String answer = "";
		String[] s = str.split(" ");
		int m = 0;
		for(String x : s) {
			int len = x.length();
			if( m < len) {
				m = len; 
				answer = x;
			}
			
		}
		return answer;
	}

}
