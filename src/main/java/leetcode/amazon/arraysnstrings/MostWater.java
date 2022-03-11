/**
 * 
 */
package leetcode.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class MostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] height = {7,6,5,3,5,6};
		int[] height = {1,8,6,2,5,4,8,3,7};
		int output = maxArea1(height);
		System.out.println("the result is: "+output);

	}
	
	//Brute Force
	public static int maxArea1(int[] height) {
		int result = 0;
		
		for(int i = 0 ; i < height.length ; i++) {
			for(int j = i+1 ; j < height.length ; j++) {
				int smt1 = Math.min(height[i], height[j]);
				int width = j-i;
				int smt2 = smt1*width;
				if(smt2 >= result)
				result = smt2;
			}

		}
		return result;
	}

	//Another option
	
}
