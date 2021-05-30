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
	static int[] ch; //채널
	
	public void DFS(int L) {
		if(L==n+1) {
			String tmp="";
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) {
					tmp+=(i+" "); //ch[i]의 값이 1인 녀석의 원소 i를 출력해야함
				}
			}
			if(tmp.length()>0) {
				System.out.println(tmp);
			}
		}else {
			ch[L]=1;   //부분집합으로 사용한다일때는 1: ch[L]에 1을 체크하고 DFS(L+1)을 통해 왼쪽으로 뻗음
			DFS(L+1);  //왼쪽(부분집합으로 사용한다는 표시)
			ch[L]=0;   //부분집합으로 사용하지 않는다 일때는 0: ch[L]에 0을 체크하고 DFS(L+1)을 통해 오른쪽으로 뻗음 
			DFS(L+1);  //오른쪽(부분집합으로 사용하지 않는다는 표시)
		}
		
	}
	
	
	
	public static void main(String[] args) {
		_6_DFSSet T = new _6_DFSSet();
		n=3;
		ch=new int[n+1];
		T.DFS(1);
	}

}
