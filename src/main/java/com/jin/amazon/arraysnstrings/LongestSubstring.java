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
			for(int j=i; j < s.length(); j++) {
				if(checkRepeat(s,i,j)) {
					result = Math.max(result, j-i+1); 
				}
			}
		}
		
		return result;
	}
	
	private static boolean checkRepeat(String s, int start, int end) {
		
		
	}
}
