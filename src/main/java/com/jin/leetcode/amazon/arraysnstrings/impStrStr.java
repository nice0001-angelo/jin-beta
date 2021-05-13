/**
 * 
 */
package com.jin.leetcode.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class impStrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "lo";
		int result;
		result = strStr(haystack, needle);
		System.out.println("result: "+result);

	}

	public static int strStr(String haystack, String needle) {
		int result = haystack.indexOf(needle);
		return result;
	}
}
