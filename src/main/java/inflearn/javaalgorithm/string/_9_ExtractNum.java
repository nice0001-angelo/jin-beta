/**
 * 
 */
package inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 * Input: g0en2T0s8eSoft
 * Ouput: 208
 */
public class _9_ExtractNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_9_ExtractNum T = new _9_ExtractNum();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	public int solution(String str) {
		/*
		 * int answer = 0; for(char x : str.toCharArray()) { if(x >=48 && x<=57) {
		 * answer = answer*10 + (x-48); //숫자 0~9: ASCII 48~57 x 값에 있는 char은 숫자연산시 ASCII
		 * 값으로 연산된다 } }
		 */
//		String answer = "";
//		for(char x : str.toCharArray()) {
//			if(Character.isDigit(x)) {
//				answer += x;
//			}
//		}
//		return Integer.parseInt(answer);
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) answer += c;
		}
		return Integer.parseInt(answer);  //래퍼클래스 Integer를 이용해서 String 값을 int value로 변환
	}

}
