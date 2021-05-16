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
		int n = kb.nextInt(); // 숫자 1자리수 받기
		String[] str = new String[n]; // 스트링 배역 갯수를 n개로 제한
		// str[] 에 각각의 문자를 배열로 저장
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		
		 //solution을 호출하고 각각의 배열 값을 하나씩 print 함 
		for(String x: T.solution(n, str)) {
		 System.out.println(x); 
		 }
		 
		// System.out.println(T.solution(n, str));
	}

	public List<String> solution(int n, String[] str) {
		List<String> answer = new ArrayList<>();
		/*
		 * StringBuilde를 이용한 리버스 for(String x : str) { String tmp = new
		 * StringBuilder(x).reverse().toString(); answer.add(tmp); }
		 */
		for(String s : str) {
			char[] x = s.toCharArray();
			int lt = 0;
			int rt = s.length()-1;
			while(rt > lt) {
				char tmp = x[lt];
				x[lt]=x[rt];
				x[rt]=tmp;
			}
			String result = String.valueOf(x);
			answer.add(result);
		}
		return answer;
	}
}
