/**
 * 
 */
package com.jin.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class MyAtoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int myAtoi(String s) {
		int i = 0;
		int sign = 1;
		int result = 0;
		if(s.length()==0) {
			return 0;
		}
		
		while(i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		if( i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
			sign = (s.charAt(i++) == '-' ) ? -1 : 1;
		
	}
}
