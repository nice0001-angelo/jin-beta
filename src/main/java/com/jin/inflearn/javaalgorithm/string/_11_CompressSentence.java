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
		int count = 1;
		String result ="";
		str=str+" "; //마지막 문자도 return 될 수 있도록 하는 중요한 장치
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				result += str.charAt(i);
				if(count>1) {
					result += String.valueOf(count);
				}
				count=1;
			}
		}
		return result;
	}
}
