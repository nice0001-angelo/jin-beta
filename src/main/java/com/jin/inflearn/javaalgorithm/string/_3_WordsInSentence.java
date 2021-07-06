/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _3_WordsInSentence {

	/**
	 * @param args
	 * Input: It is time to Study
	 * Output: Study
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
		
			
		}
		/*
		 * int pos; while((pos = str.indexOf(" "))!=-1) { String tmp =
		 * str.substring(0,pos); int len = tmp.length(); if(len > m) { m = len; answer =
		 * tmp; } str = str.substring(pos+1); //pos+1 부터 끝까지 } if(str.length() > m) {
		 * answer = str; } return answer;
		 */
	}

}
