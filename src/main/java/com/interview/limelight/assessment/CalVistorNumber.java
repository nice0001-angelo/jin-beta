/**
 * 
 */
package com.interview.limelight.assessment;

import java.util.*;

/**
 * @author njh
 *
 */
public class CalVistorNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalVistorNumber T = new CalVistorNumber();
		List<Integer> input = new ArrayList<Integer>();

		T.maxSum(input);

	}

	public List<Integer> maxSum(List<Integer> input){
		
		int sumValue = 0;
		int sumSize = 0;
		Map<Integer, List<Integer>> tempMap = new HashMap<Integer, List<Integer>>();
		
		List<Integer> temp = new ArrayList<Integer>();
		
		for(Integer in : input) {
			if(in != null) {
				temp.add(in);
				sumValue += in;
				sumSize++;
			} else {
				if(null == tempMap.get(sumValue) || tempMap.get(sumValue).size()<sumSize) {
					tempMap.put(sumValue, temp);
				}
				//initializing
				sumSize = 0;
				sumValue = 0;
				temp = new ArrayList<Integer>();
			}
		}
		int maxKeyInt = 0;
		for(Integer keyInt : tempMap.keySet()) {
			if(maxKeyInt < keyInt) maxKeyInt = keyInt;
		}
		
		return tempMap.get(maxKeyInt);
		
	}
	
	public List<Integer> minAve(List<Integer> input){
		int sumValue = 0;
		int sumSize = 0;
		Map<Integer, List<Integer>> tempMap = new HashMap<Integer, List<Integer>>();
		
		List<Integer> temp = new ArrayList<Integer>();
		for(Integer in : input) {
			if(in != null) {
				temp.add(in);
				sumValue += in;
				sumSize++;
			} else {
				int avg = sumValue /sumSize;
				
				if(null == tempMap.get(avg)) {
					tempMap.put(avg, temp);
				}
				//initializing
				sumSize = 0;
				sumValue = 0;
				temp = new ArrayList<Integer>();
			}
		}
		int minKeyInt = Integer.MAX_VALUE;
		for(Integer keyInt : tempMap.keySet()) {
			if(minKeyInt > keyInt) minKeyInt = keyInt;
		}
		
		return tempMap.get(minKeyInt);
	}
}
