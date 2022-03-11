/**
 * 
 */
package leetcode.amazon.arraysnstrings;

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


	//집중필요(해석 필요)
	private static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
		int lo = i + 1;
		int hi = nums.length - 1;
		while(lo < hi){
			int sum = nums[i] + nums[lo] + nums[hi];
			if(sum < 0) {
				++lo;
			} else if(sum > 0) {
				--hi;
			} else {
				res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
				while(lo < hi && nums[lo] == nums[lo-1])++lo;
				
			}
		}
		
	}
}
