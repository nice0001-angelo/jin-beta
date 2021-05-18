/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_12_Decription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_1_12_Decription T = new _1_12_Decription();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(k, str));
		System.out.println(T.solution(k, str));
	}

	public String solution(int k, String str) {
		String answer = "";
		for(int i=0; i < k ; i++) {
			String tmp = str.substring(0,7);
			System.out.println(tmp);
			str = str.substring(7);
		}
		return answer;
	}
}
