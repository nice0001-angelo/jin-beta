/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _4_FibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_4_FibonacciNumber T = new _4_FibonacciNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) {
			System.out.print(x+" ");	
		}
		
	}

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i < n; i++) {
			answer[i] = answer[i-1] + answer[i-2]; 
		}
		return answer;
	}
}
