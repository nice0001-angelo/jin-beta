/**
 * 
 */
package com.jin.amazon.arraysnstrings;

import java.util.*;

/**
 * @author njh
 *
 */
public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int threeSumClosest(int[] nums, int target) {
		int diff = Integer.MAX_VALUE;
		int sz = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < sz && diff != 0; i++) {
			int lo = i + 1;  
			int hi = sz - 1;
		}
	}
}
