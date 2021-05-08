/**
 * 
 */
package com.jin.amazon.arraysnstrings;

import java.util.*;

/**
 * @author njh
 *
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-1,0,1,2,-1,-4};
		List<List<Integer>> result = threeSum(input);
		System.out.println("result: "+result);

	}

	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
			if( i == 0 || nums[i-1] != nums[i]) {
				twoSumII(nums, i, res);
			}
		}
	return res;	
	}


	private static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
		int Io = i + 1, hi = nums.length - 1;
		while(Io < hi){
			int sum = nums[i] + nums[Io] + nums[hi];
			if(sum < 0) {
				++Io;
			} else if(sum > 0) {
				--hi;
			} else {
				res.add(Arrays.asList(nums[i], nums[Io++], nums[hi--]));
				while(Io < hi && nums[Io] == nums[Io-1])++Io;
				
			}
		}
		
	}
}
