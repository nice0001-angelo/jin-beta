/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _9_MaxSumNbyNArray {

	/**
	 * @param args
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19 
	 */
	public static void main(String[] args) {
		_9_MaxSumNbyNArray T = new _9_MaxSumNbyNArray();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));

	}
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i=0; i<n; i++) {
			sum1 = sum2 =0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1 = sum2 = 0;
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-1-i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}

}
