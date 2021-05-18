/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_6_DeleteDupChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_1_6_DeleteDupChar T = new _1_6_DeleteDupChar();
		Scanner tb = new Scanner(System.in);
		String str = tb.next();
		System.out.println(T.solution(str));
	}

	public String solution(String str) {
		String answer = new String();
		for(int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(i == str.indexOf(str.charAt(i))) {
			answer +=str.charAt(i);	
			}
		}
		return answer;
	}
}
