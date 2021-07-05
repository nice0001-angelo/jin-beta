/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _1_FindCharCount {

	/**
	 * @param args: Input Parameter로 String 열과 찾고자하는 값을 넣었을때 몇개가 나오는지 확인하는 코드
	 * Input: ComputerCooler
	 * Input: c
	 * Output: 2
	 */
	public static void main(String[] args) {
		//static 에서 instance(Non-static) 객체를 생성하기 위해서는 이렇게 클래스 객체를 생성해야함
		//이렇게 하면 호출할 메서드를 static으로 선언하지 않아도 됨
		_1_FindCharCount T = new _1_FindCharCount();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		//String을 읽어들이고(next()) charAt(0)을 통해서 첫번째 char 값을 가져오는 것임. charAt는 char 변수를 return함. 매우 유용함.
		char c = kb.next().charAt(0);
	
		System.out.println(T.solution(str,c));
		System.out.println();
		System.out.println();
	}
	
	public int solution(String str, char t) {
		int answer=0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t); //char은 Character(java.lang) 써야 함. 배열을 Arrays 쓰듯이 Character은 char은 레퍼
		/*
		 * for(int i=0; i < str.length(); i++) {
		 *     if(str.charAt(i) == t) { 
		 *     answer++; 
		 *     } 
		 *  }
		 */
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		return answer;
	}
}
