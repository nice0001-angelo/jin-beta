/**
 * 
 */
package com.jin.programmers.lvl1;

import org.hibernate.validator.internal.util.privilegedactions.*;

import net.jin.utils.*;

/**
 * @author njh
 * 체육복: 탐욕법(Greedy)
 */
public class Uniform {

	/**
	 * @param args
	 */
	static int n = 10;
	static int[] lost = { 2, 4 };
	static int[] reserve = { 1 };

	public static void main(String[] args) {

		
		int[] nam = {1,3,5,6,7,8};
		int[]  peo = new int[5];
		for(int n : nam) {
			peo[n-1]--;
		}
		
		
		
		int sol = Solution(n, lost, reserve);
		System.out.println("The Answer is: "+ sol);
	}

	public static int Solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n];//size n 인 int 형 배열 people 객체형 필드 생성
		int answer = n; //초기값을 n 으로 하는 int 타입 answer 필드 정의

		
		// uniform 을 잃어버린 학생의 번호를 
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
