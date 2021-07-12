/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _11_CompressSentence {

	/**
	 * @param args
	 * Input: KKHSSSSSSSE
	 * Output: K2HS7E
	 */
	public static void main(String[] args) {
		_11_CompressSentence T = new _11_CompressSentence();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	public String solution(String str) {
//		String result = new String();
//		str = str+" ";
//		int cnt = 1;
//		for(int i = 0; i < str.length()-1; i++) {
//			if(str.charAt(i) == str.charAt(i+1)) {
//				cnt++;
//			}else {
//				result += str.charAt(i);
//				if(cnt > 1) {
//					result += String.valueOf(cnt);
//				}
//				cnt = 1;
//			}
//		}
//		return result;
		int count = 1;
		String result ="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
