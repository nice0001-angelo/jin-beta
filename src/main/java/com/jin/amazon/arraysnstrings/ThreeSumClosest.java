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

		int[] nums = {-1,2,1,-4};
		int target = 1;
		int result;
		result = threeSumClosest(nums, target);
		System.out.println("result: "+result);
	}

	// 이해 필요
	public static int threeSumClosest(int[] nums, int target) {
		int diff = Integer.MAX_VALUE;
		int sz = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < sz && diff != 0; i++) {
			int lo = i + 1;  
			int hi = sz - 1;
			while(lo < hi) {
				int sum = nums[i] + nums[lo] + nums[hi];
				if(Math.abs(target - sum) < Math.abs(diff))
					diff = target - sum;
				if(sum < target)
					++lo;
				else
					--hi;
			}
		}
		return target - diff;
	}
}
