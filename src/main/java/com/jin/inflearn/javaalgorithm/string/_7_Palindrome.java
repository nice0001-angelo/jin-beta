/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _7_Palindrome {

	/**
	 * @param args
	 * Input: gooG
	 * Output: YES
	 */
	public static void main(String[] args) {
		_7_Palindrome T = new _7_Palindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
//		String upstr = str.toUpperCase();
//		
//		int rt = upstr.length()-1; 
//		for (int lt = 0 ; lt < upstr.length()/2; lt++) {
//		if(str.charAt(lt) == str.charAt(rt)) { 
//			rt--; 
//			} else { 
//				return "N0"; 
//				} 
//		} return "YES";
		 
//		 String upstr = str.toUpperCase();
//		 for(int i = 0 ; i < upstr.length()/2; i++) {
//		 if(upstr.charAt(i)!=upstr.charAt(upstr.length()-1-i)) return "NO"; 
//		 } return "YES";
		 
//		String reveredStr = new StringBuffer(str).reverse().toString();
//		//if(str.equals(reveredStr)) return "YES"; // 대소문자구분할때
//		if(str.equalsIgnoreCase(reveredStr)) return "YES"; //대소문자 구분없이 무시하고 결과 낼때 
//		return "NO";
		
//		String reversedStr = new StringBuilder(str).reverse().toString();
//		if(str.equals(reversedStr)) return "YES";
//		return "NO";
		
		String upperCasedStr = str.toUpperCase();
		for(int i=0; i<upperCasedStr.length()/2; i++) {
			
		}
		
	}
}
