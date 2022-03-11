/**
 * 
 */
package inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _11_Mentoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_11_Mentoring T = new _11_Mentoring();
		Scanner kb = new Scanner(System.in);
		int stnum = kb.nextInt();
		int testnum = kb.nextInt();
		int[][] arr = new int[testnum][stnum];
		for(int i=0; i<testnum; i++) {
			for(int j=0; j<stnum; j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println(T.solution(stnum, testnum, arr));
	}
	
	public int solution(int stnum, int testnum, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<stnum; i++) {
			for(int j=0; j<stnum; j++) {
				int cnt=0;
				for(int k=0; k<testnum; k++) {
					int pi=0, pj=0;
					for(int s=0; s<stnum; s++) {
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==testnum) {
					answer++;
				}
			}
		}
		return answer;
		
	}

}
