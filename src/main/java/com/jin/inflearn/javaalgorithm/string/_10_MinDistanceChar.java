/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_MinDistanceChar {

	/**
	 * @param args
	 * Input: teachermode e 문자열(teachermode)내에서 각문자와 문자(e)와의 거리를 계산하시오
	 * Output: 10121012210
	 */
	public static void main(String[] args) {
		_10_MinDistanceChar T = new _10_MinDistanceChar();
		Scanner kb = new Scanner(System.in);
//		String str = kb.next();i
//		char t = kb.next().charAt(0);
//		for(int x : T.solution(str, t)) {
//			System.out.print(x+" ");
		String str = kb.next();
		char x = kb.next().charAt(0);
		for(int i : T.solution(str, x)) {
			System.out.print(i+" ");
		}
	}
	
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		int lp = 1000;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				lp = 0;
				answer[i] = lp;
			} else {
				lp++;
				answer[i] = lp;
			}
		}
		int rp = 1000;
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			if(str.charAt(i) == t) {
				rp = 0;
			} else {
				rp++;
				answer[i] = Math.min(rp, answer[i]);
			}
		}
		return answer;
	}
	
	
}
