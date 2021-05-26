/**
 * 
 */
package com.jin.inflearn.javaalgorithm.array;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_CountPeak {

	/**
	 * @param args
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
	 */
	public static void main(String[] args) {
		_10_CountPeak T = new _10_CountPeak();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n]; //0 으로 초기화
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n,arr));
	}
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		boolean flag = true;
		/*
		 * for(int i=1; i<=n; i++) { for(int j=1; j<=n; j++) { arr[0][j]=0;
		 * arr[n+1][j]=0; arr[i][0]=0; arr[i][n+1]=0; if(arr[i][j]>arr[i-1][j] &&
		 * arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1]) {
		 * answer++; } } }
		 */
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(arr[nx][ny]>=arr[i][j]) {
						flag = false; break;
					}
					if(flag) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
