/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

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
		int n = 300;
		int[] fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i]+" ");	
		}
		
	}
	public int DFS(int n) {
		int[] fibo = new int[n];
		if(n==1) {
			return fibo[n]=1;
		}else if(n==2) {
			return fibo[n]=1;
		}else {
			return fibo[n]=DFS(n-2)+DFS(n-1);
		}
	}
}
