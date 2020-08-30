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
		String str = centerCharacter.solution("abcdef");
		System.out.println(str);
	}

	public String solution(String s) {
		return s.substring((s.length()-1)/2, s.length()/2+1);
	}
}
