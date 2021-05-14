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
		
		//static 에서 instance(Non-static) 객체를 생성하기 위해서는 이렇게 클래스 객체를 생성해야함
		//이렇게 하면 호출할 메서드를 static으로 선언하지 않아도 됨
		_4_ReverseWords T = new _4_ReverseWords();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		//String을 읽어들이고(next()) charAt(0)을 통해서 첫번째 char 값을 가져오는 것임. charAt는 char 변수를 return함
		char c = kb.next().charAt(0); 
		
		System.out.println(T.solution(str,c));

	}
	
	public int solution(String str, char c) {
		int answer=0;
		return answer;
	}

}
