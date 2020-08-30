/**
 * 
 */
package com.jin.programmers.lvl1;

/**
 * @author njh
 *
 */
public class CenterCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CenterCharacter centerCharacter = new CenterCharacter();
		String str = centerCharacter.solution("abcde");
		System.out.println(str);
	}

	public String solution(String s) {
		String answer = "";
		int size = s.length();
		int half = size/2;
		System.out.println(s.charAt(2)&&s.charAt(3));
//		if (size % 2 == 0) {
//			answer = System.out.println(s.charAt(2) + s.charAt(3));
//		} else {
//			answer = System.out.println(s.charAt(half));
//		}
		return answer;
	}
}
