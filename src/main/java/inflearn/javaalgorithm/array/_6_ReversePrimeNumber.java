/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _6_ReversePrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_6_ReversePrimeNumber T = new _6_ReversePrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
		
		
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int tmp = arr[i]; //25
			int res = 0;
			while(tmp>0) {
				int t = tmp%10; //arr[0] 25이면 5
				res=res*10+t; //0*10+5=5
				tmp=tmp/10; // 25/10=2
			}
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	
	public boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
