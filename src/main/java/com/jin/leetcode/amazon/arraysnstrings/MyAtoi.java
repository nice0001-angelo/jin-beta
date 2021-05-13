/**
 * 
 */
package com.jin.leetcode.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class MyAtoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "4193 with words"; 
		int output = myAtoi(input);
		System.out.println("output: "+output);

	}

	
	public static int myAtoi(String s) {
		int i = 0;
		int sign = 1;
		int result = 0;
		
		//if length == 0 then make result to 0
		if(s.length()==0) {
			return 0;
		}
		
		//Discard whitespace in the beginning
		while(i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		//check if optional sign if it exists
		if( i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
			sign = (s.charAt(i++) == '-' ) ? -1 : 1;
		
		//Build the result check for overflow/underflow condition 
		while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			result = result * 10 + (s.charAt(i++) - '0');
		}
		return result * sign;
		
	}
}
