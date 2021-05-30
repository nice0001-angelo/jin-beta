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
			ch[L]=1;   //사용한다일때는 1
			DFS(L+1);  //왼쪽(사용한다는 표시)
			ch[L]=0;   //사용하지 않는다 일때는 0
			DFS(L+1);  //오른쪽(사용하지 않는다는 표시)
		}
		
	}
	
	
	
	public static void main(String[] args) {
		_6_DFSSet T = new _6_DFSSet();
		n=3;
		ch=new int[n+1];
		T.DFS(1);
	}

}
