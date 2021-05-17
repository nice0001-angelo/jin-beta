/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_MinDistanceChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_10_MinDistanceChar T = new _10_MinDistanceChar();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char t = kb.next().charAt(0);
		for(int x : T.solution(str, t)) {
			System.out.println(x+" ");
		}
	}
	
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		return answer;
	}
	
	
}
