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
		int p = 0;
		String result = new String();
		for(int i = 0; i < str.length()-1; i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					p++;
					result = Character.toString(str.charAt(i));
					result += p; 
				}
			}
		}
		return "";
	}
}
