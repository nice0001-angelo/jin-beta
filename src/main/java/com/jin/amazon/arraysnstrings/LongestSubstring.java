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
		String[] strArray = s.split("");
		System.out.println("strArray: "+strArray);
		System.out.println("strArray size: "+strArray.length);
		int a = 0;
		for(int i = 0; i < strArray.length; i++) {
			for(int j=i+1; j < strArray.length; j++) {
				if(strArray[j] == strArray[i]) {
					String result = s.substring(i,j);
					a = result.length();
					System.out.println("result: "+result);
				}
			}
		
		}
		return a;
	}
}
