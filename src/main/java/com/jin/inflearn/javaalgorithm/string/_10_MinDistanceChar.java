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
	 * 왼쪽에서 오른쪽으로 한번 검색하고 오른쪽에서 왼쪽을 한번씩 검색해서 목적어랑의 거리를 구한후 두 개의 스캔중에 작은 숫자를 리턴하면 좌로부터 우로부터 최소거리를 구할수 있다.
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
//		int[] answer = new int[str.length()];
//		int lp = 1000;
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) {
//				lp = 0;
//				answer[i] = lp;
//			} else {
//				lp++;
//				answer[i] = lp;
//			}
//		}
//		int rp = 1000;
//		for(int i = str.length()-1 ; i >= 0 ; i--) {
//			if(str.charAt(i) == t) {
//				rp = 0;
//			} else {
//				rp++;
//				answer[i] = Math.min(rp, answer[i]);
//			}
//		}
//		return answer;
		int[] result = new int[str.length()];
		int lt = 1000;
		for(int i=0; i<str.length(); i++) {
			if(t==str.charAt(i)) {
				lt = 0;
				result[i]=lt;
			} else {
				lt++;
				result[i]=lt;
			}
		}
		int rt = 1000;
		for(int j=str.length()-1; j>=0; j--) {
			if(t==str.charAt(j)) {
				rt=0;
				result[j]=rt;
			} else {
				rt++;
				result[j]=Math.min(rt, result[j]);
			}
		}
		return result;
	}
	
	
}
