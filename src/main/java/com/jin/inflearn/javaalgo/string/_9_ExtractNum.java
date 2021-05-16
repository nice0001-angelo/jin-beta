/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _9_ExtractNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_9_ExtractNum T = new _9_ExtractNum();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	public int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x >=48 && x<=57) answer = answer*10 + (x-48); //숫자 0~9: ASCII 48~57 
		}
		return answer;
	}

}
