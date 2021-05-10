/**
 * 
 */
package com.amazon.assessment;

import java.util.*;

/**
 * @author njh
 *
 */
public class RobotRodeo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<String> doesCircleExist(List<String> commands){
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int x, y, dir;
		
		List<String> resultList = new ArrayList<String>();
		
		for(String command : commands) {
			String result = "";
			x=0;
			y=0;
			dir=0;
			for(char comm : command.toCharArray()) {
				if(comm == 'G') {
					x += dx[dir];
					y += dy[dir];
					} else if (comm == 'L') {
						dir = (dir+1) % 4;
					} else {
						dir = (dir+3) % 4;
					}
				}
			if ( x==0 && y==0 || dir !=0) {
				result = "YES";
			} else {
				result = "NO";
			}
			resultList.add(result);
		}
		return resultList;
	}
}
