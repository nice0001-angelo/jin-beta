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
		String[] strArr = new String[x];
		for(int i=0; i<x; i++) {
			strArr[i] = kb.next();
		}
		for(String c : T.solution(x, strArr)) {
			System.out.println(c);	
		}
	}

	public List<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		
		  //StringBuilder를 이용한 리버스 
//		for(String x : str) { 
//			String tmp = new StringBuilder(x).reverse().toString(); 
//			answer.add(tmp); 
//			}
		for(String s : str) {
			char[] charArr = s.toCharArray();
			int lt = 0;
			int rt = s.length()-1;
			while(lt < rt) {
				char tmp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt]=tmp;
				lt++;
				rt--;
			}
			String result = String.valueOf(charArr);
			answer.add(result); //answer is List Collection
		}
		
		return answer;
	}
}
