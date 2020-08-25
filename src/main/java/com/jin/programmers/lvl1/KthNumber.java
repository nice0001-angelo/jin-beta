/**
 * 
 */
package com.jin.programmers.lvl1;

/**
 * @author njh
 *
 */
public class KthNumber {

	/**
	 * @param args
	 */
	
	static int[] array = {1,5,2,6,3,7,4};
	static int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KthNumber kthNumber = new KthNumber();
		int[] kth = kthNumber.Solution(array, commands);
		System.out.println(kth);
	}
	
	public int[] Solution(int[] array, int[][] commands) {
		int[] answer = {};
		return answer;
	}

}
