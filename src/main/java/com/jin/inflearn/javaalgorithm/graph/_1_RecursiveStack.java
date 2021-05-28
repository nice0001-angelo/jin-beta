/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */
public class _1_RecursiveStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_1_RecursiveStack T = new _1_RecursiveStack();
		T.DFS(3);

	}

	public void DFS(int n) {
		if(n==0) {
			return; //메소드 종료 의미
		} else{
			DFS(n-1); //자기가 자기를 호출함 재귀함수 Recursive: 재귀함수는 반복문의 형태
			System.out.print(n+" ");
		}

	}
}
