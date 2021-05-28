/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */
public class _3_Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_3_Factorial T = new _3_Factorial();
		System.out.println(T.DFS(5));

	}
	
	public int DFS(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*DFS(n-1);
		}
	}

}
