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
		int n = 100;
		for(int i=1; i<=n; i++) {
			System.out.print(T.DFS(i)+" ");	
		}
		
	}
	
	public int DFS(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 1;
		}else {
			return DFS(n-2)+DFS(n-1);
		}
	}
}
