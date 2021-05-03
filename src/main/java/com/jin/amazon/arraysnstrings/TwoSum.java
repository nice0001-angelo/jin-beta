/**
 * 
 */
package com.jin.amazon.arraysnstrings;

import java.util.*;

/**
 * @author njh
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println("the result is: "+(String)result.toString());

	}

    public static int[] twoSum(int[] nums, int target) {
    	for(int i=0; i< nums.length; i++) {
    		for(int j=i+1; j < nums.length; j++) {
    			if(nums[j] == target - nums[i]) {
    				return new int[] {i,j};
    			}
    		}
    	}
		throw new IllegalArgumentException("Cant slove problem ");
    }
    
    public static int[] twoSumHashed2(int[] nums, int target) {
    	
    }
}

