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
		String[] s = str.split(str);
		for(String x : s) {
			System.out.println(x);
			answer += x;
		}
		return answer;
	}

}
