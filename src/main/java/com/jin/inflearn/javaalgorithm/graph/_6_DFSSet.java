/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */
public class _6_DFSSet {

	/**
	 * @param args
	 */
	static int n;
	static int[] ch;
	
	public void DFS(int L) {
		if(L==n+1) {
			
		}else {
			DFS(L+1);
			DFS(L+1);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		_6_DFSSet T = new _6_DFSSet();
		n=3;
		ch=new int[n+1];
		T.DFS(1);
	}

}
