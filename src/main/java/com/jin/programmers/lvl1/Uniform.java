/**
 * 
 */
package com.jin.programmers.lvl1;

import net.jin.utils.*;

/**
 * @author njh
 * 체육복: 탐욕법(Greedy)
 */
public class Uniform {

	/**
	 * @param args
	 */
	static int n = 5;
	static int[] lost = { 2, 4 };
	static int[] reserve = { 1, 3, 5 };

	public static void main(String[] args) {

		int sol = Solution(n, lost, reserve);
		System.out.println("The Answer is: "+sol);
	}

	public static int Solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n];
		int answer = n;

		for (int l : lost) {
			people[l - 1]--;
		}

		for (int r : reserve) {
			people[r - 1]++;
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] == -1) {
				if (i - 1 >= 0 && people[i - 1] == 1) {
					people[i]++;
					people[i - 1]--;
				} else if (i + 1 < people.length && people[i + 1] == 1) {
					people[i]++;
					people[i + 1]--;
				} else
					answer--;
			}
		}

		return answer;

	}
}
