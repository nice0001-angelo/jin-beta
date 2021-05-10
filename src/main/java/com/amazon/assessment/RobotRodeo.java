/**
 * 
 */
package com.amazon.assessment;

import java.util.*;

/**
 * @author njh
 * the Amazon robotics team wants to demonstrate how easy it is to use their latest robot.
 * For the event, they have built a simple language to control it:
 * G instructs the robot to move forward one step.
 * L instructs the robot to turn left in place.
 * R instructs the robot to turn right in place.
 * 
 * To keep the event more interactive, once the robot has completed the list of instructions,
 * it will repeat them in an infinite loop.
 * Given the time and effort in building this robot, the robotics team don't want to lose it 
 * because of a bad sequence of instructions.
 * They'veasked you to build a simulator based on a list of commands that will determine
 * if it exists a circle such that the robot always moves with the circle.
 * 
 * Consider the commands R and G executed infinitely.
 * A diagram of the robot's movement looks like:
 * RG -> RG
 * ^
 * |     | 
 *       V 
 * RG <- RG
 * 
 * The robot will never leave the circle.
 * 
 * Function Description
 * Complete the function doesCircleExist in the editor below.
 * The function must return an array of n strings either YES or NO 
 * based on whether the robot is bound within a circle or not, in order of test results
 * 
 *  doesCircleExist has the following parameter(s):
 *  commands[commands[0],...commands[n-1]]: As array of n commands[i]
 *  where eache represents a list of commands to test.
 *  
 *  Constraints
 *  1<=|commands[i]|<=2500
 *  1<=n<=10
 *  Each command consists of G, L, and R only
 * 
 * 
 * 
 */
public class RobotRodeo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> commands = new ArrayList<>(); 
		commands.add(0,"GR");
		//commands.add(1,"G");
		//System.out.println(commands.get(1));
		List<String> result = new ArrayList<>();
		result = doesCircleExist(commands);
		System.out.println(result);
		

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
