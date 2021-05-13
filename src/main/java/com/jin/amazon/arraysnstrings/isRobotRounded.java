/**
 * 
 */
package com.jin.amazon.arraysnstrings;

/**
 * @author njh
 *
 */
public class isRobotRounded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String commands ="GLL";
		boolean result;
		result = isRobotRounded(commands);
		System.out.println("result:"+result);
	}

	
	public static boolean isRobotRounded(String commands){
		// north = 0, east = 1, south = 2, west = 3
		int[][] directions = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
		
		// initial position is in the center
		int x=0, y=0;
		
		// facing north
		int idx = 0;
		
		for(char i : commands.toCharArray()) {
			if(i == 'L') {
				idx = (idx+3) % 4;
			} else if (i == 'R') {
				idx = (idx+1) % 4;
			} else {
				x += directions[idx][0];
				y += directions[idx][1];
			}
		}
		
		//after one cycle
		//robot returns into initial position
		//or robot doesn't face north
		return (x==0 && y==0)||(idx!=0);
	}
}
