/**
 * 
 */
package com.jin.inflearn.javaalgorithm.hashmaptreeset;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_HashSlidingWindowAnagram {

	/**
	 * @param args
	 * Instruction: 7 4 (총 매출기간이 7일이고 그중에서 4일간의 연속된 일자의 매출액의 종류를 구하시오)
	 * Input: bacaAacbaa abca
	 * Output: 3 4 4 3
	 * SlidingWindow에 대해서 사전 지식 있어야 함
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_HashSlidingWindowAnagram T = new _4_HashSlidingWindowAnagram();
		System.out.println("Please Enter Character for Anagram: Example: ===>");
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println("The Answers are ===> "+T.solution(a, b));
	}
	
	public int solution(String a, String b) {

		//From here I made the code by myself
		int answer = 0;
		
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
	
		//Put into the am using the String a (array from 0 to b-1
		for(int i = 0; i<b.length()-1; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		}
		
		//Put into the bm using the String b
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0)+1);
		}
		
		//Left point
		int lt = 0;
		
		//rt will shift from length of b-1
		for(int rt=b.length()-1; rt<a.length(); rt++) {
			
			//rt의 값을 am 넣기
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			
			//값 비교하기
			if(am.equals(bm)) answer++;
			
			//lt 값의 value -1
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			
			//제일 왼쪽의 값이 0 이면 삭제
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			
			//다음 턴을 위해서 lt값 증가 
			lt++;
		}
		return answer;
	}
}
