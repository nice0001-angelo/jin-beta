/**
 * 
 */
package com.amazon.assessment;

import java.util.*;

/**
 * @author njh
 *
 */
public class TransactionLogs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<String> processLogs(List<String> logs, int threshold){
		
		List<String> resultList = new ArrayList<String>();
		
		Map<String, Integer> chkMap = new HashMap<String, Integer>();
		
		for(String log : logs) {
			String[] logArray = log.split(" ");
			
		}
	}

}
