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
		result = intsum.solution(5, 3);
		System.out.println("result is: " + result);

	}

	public long solution(int a, int b) {
    	long answer = 0;
    	if(a < b) {
    		for(int i = a; i <= b; i++) {
    			answer = i+answer;
    	}
    	}else if(a==b) {
    		return a;
    	}else {
    		for(int i = b; i <= a; i++) {
        		answer = i+answer;
    	}
    	}
    		return answer;    	
    }
}
