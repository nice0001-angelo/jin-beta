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
		
		lengthOfLongestSubstring(s);
		
	}

	public static int lengthOfLongestSubstring(String s) {
		String[] strArray = s.split("");
		System.out.println("strArray: "+strArray);
		System.out.println("strArray size: "+strArray.length);
		for(int i = 0; i< strArray.length; i++) {
			
		}
		
	}
}
