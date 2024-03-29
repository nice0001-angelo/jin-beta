/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _2_VisibleStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_2_VisibleStudent T = new _2_VisibleStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
	
	public int solution(int n, int[] arr) {
		int answer = 1;
		int maxNum = arr[0];
		for(int i = 1 ; i < n ; i++)
			if(arr[i] > arr[i-1]) {
				answer++;
				maxNum = arr[i];
			}
		return answer;
	}
}
