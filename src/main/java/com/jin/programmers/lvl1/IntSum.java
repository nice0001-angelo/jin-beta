/**
 * 
 */
package com.jin.programmers.lvl1;

/**
 * @author njh
 *
 */
public class IntSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntSum intsum = new IntSum();
		long result = 0;
		result = intsum.solution(3,5);
		System.out.println("result is: "+result);

	}

	
    public long solution(int a, int b) {
    	long answer = 0;
    	
    	for(int i = a; i <= b; i++) {
    		answer = i+answer;
    	}
    	return answer;    	
    }
}
