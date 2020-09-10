/**
 * 
 */
package com.jin.programmers.lvl1;

import net.jin.utils.*;

/**
 * @author njh
 *
 */
public class StringSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] inString = {"sun","bed","car"}; 
		StringSorting strSort = new StringSorting();
		strSort.solution(inString, 1);

	}

	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		for(String str : strings) {
			System.out.println(str);
			System.out.println(str.getClass().getName());
			System.out.println("");
			System.out.println(str.getClass().getName());
			System.out.println("");
			System.out.println("");
		}
		
		
		return answer;
	}
}
