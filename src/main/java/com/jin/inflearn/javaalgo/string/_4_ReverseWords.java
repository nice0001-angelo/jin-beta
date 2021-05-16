/**
 * 
 */
package com.jin.inflearn.javaalgo.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_4_ReverseWords T = new _4_ReverseWords();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x: T.solution(n, str)) {
		System.out.println(x);
		}
	}
	
	
	public List<String> solution(int n, String[] str) {
		List<String> answer = new ArrayList<>();
		/* StringBuilde를 이용한 리버스
		 * for(String x : str) { 
		 * String tmp = new StringBuilder(x).reverse().toString();
		 * answer.add(tmp); 
		 * }
		 */
		for(String x : str) {
			char[] s = x.toCharArray();
		}
		return answer;
	}
}
