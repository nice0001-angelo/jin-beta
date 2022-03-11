/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _7_CalculateScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_7_CalculateScore T = new _7_CalculateScore();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		int sum =0;
		if(arr[0] == 1) {
			answer[0] = 1;
			sum = 1;
		} else {
			answer[0] = 0;
		}
		for(int i = 1; i<n; i++) {
			if(arr[i] == 1 ) {
				answer[i] = answer[i-1]+1;
				sum += answer[i];
			} else {
				answer[i] = 0;
			}
		}
		System.out.println("sum: "+sum);
		return answer;
	}
}
