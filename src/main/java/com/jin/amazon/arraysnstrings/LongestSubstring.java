/**
 * 
 */
package com.jin.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class LongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcbb";
		
		int result = lengthOfLongestSubstring(s);
		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		for(int i=0; i < s.length(); i++) {
			for(int j=i; j < s.length(); j++)
		}
		
		return result;
	}
}