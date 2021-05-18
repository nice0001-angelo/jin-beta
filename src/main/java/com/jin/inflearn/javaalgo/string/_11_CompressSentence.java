/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _11_CompressSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_11_CompressSentence T = new _11_CompressSentence();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	public String solution(String str) {
		int cnt = 1;
		String result = new String();
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				result = str.charAt(i)+String.valueOf(cnt);
			}
		}
		return result;
	}
}
