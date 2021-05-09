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
			String fromId = logArray[0];
			String toId = logArray[1];
			if(fromId.equals(toId)) {
				if(null == chkMap.get(fromId)) {
					chkMap.put(fromId, 1);
				} else {
					chkMap.put(fromId, chkMap.get(fromId)+1);
				}
			} else {
				if(null == chkMap.get(fromId)) {
					chkMap.put(fromId,1);
				} else {
					chkMap.put(fromId, chkMap.get(fromId)+1);
				}
				if (null == chkMap.get(toId)) {
					chkMap.put(toId, 1);
				} else {
					chkMap.put(toId, chkMap.get(toId)+1);
				}
			}
			
		}
		
		int[][] chkInt = new int[chkMap.size()][2];
		
		int i = 0;
		for(String id : chkMap.keySet()) {
			chkInt[i][0] = Integer.parseInt(id);
			chkInt[i][1] = chkMap.get(id);
			i++;
		}
		
		Arrays.sort(chkInt, 
				new Comparator<int[]>() {
					public int compare(final int[] a, final int[] b) {
						return a[0] - b[0];
					}
				});
		
		for(int j =0; j < chkInt.length; j++) {
			if(chkInt[j][1] >= threshold) {
				resultList.add(String.valueOf(chkInt[j][0]));
			}
		}
		if(resultList.size() == 0) {
			resultList.add("");
		}
	}

}
