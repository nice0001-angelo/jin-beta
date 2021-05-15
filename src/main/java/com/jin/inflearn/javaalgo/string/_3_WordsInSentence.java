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
		int m = Integer.MIN_VALUE;
		/*
		 * String[] s = str.split(" "); for(String x : s) { int len = x.length(); if(len
		 * > m) { m = len; answer = x; } }
		 */
		int pos;
		while((pos = str.indexOf(" "))!=-1) {
			String tmp = str.substring(0,pos);
			int len = str.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
		}
		return answer;
	}

}
