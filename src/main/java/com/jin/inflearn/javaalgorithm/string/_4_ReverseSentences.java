/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_ReverseSentences {

	/**
	 * @param args
	 * Input: 3
	 * Input: Good
	 * Input: Time
	 * Input: Big
	 * Output: dooG
	 * Output: emiT
	 * Output: giB
	 */
	public static void main(String[] args) {
		_4_ReverseSentences T = new _4_ReverseSentences();
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		String[] str = new String[x];
		for(int i=0; i<x; i++) {
			str[i] = kb.next();
		}
		for(String c : T.solution(x, str)) {
			System.out.println(c);	
		}
		
	}

	public List<String> solution(int n, String[] str) {
		List<String> answer = new ArrayList<String>();
		
		  //StringBuilder를 이용한 리버스 
//		for(String x : str) { 
//			String tmp = new StringBuilder(x).reverse().toString(); 
//			answer.add(tmp); 
//			}
		 
//		for(String s : str) {
//			char[] x = s.toCharArray();
//			int lt = 0;
//			int rt = s.length()-1;
//			while(rt > lt) {
//				char tmp = x[lt];
//				x[lt]=x[rt];
//				x[rt]=tmp;
//				lt++;
//				rt--;
//			}
//			String result = String.valueOf(x);
//			answer.add(result); //answer List Collection
//		}
		for(String s : str) {
			char[] arr = s.toCharArray();
		}
		
		return answer;
	}
}
