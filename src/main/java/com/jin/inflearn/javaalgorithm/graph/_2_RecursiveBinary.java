/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */
public class _2_RecursiveBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_2_RecursiveBinary T = new _2_RecursiveBinary();
		T.DFS(11);

	}
	
	public void DFS(int n) {
		if(n == 0) {
			return;
		}else {

			DFS(n/2);
			System.out.println(n+" ");			
		}
		
		
	}

}
