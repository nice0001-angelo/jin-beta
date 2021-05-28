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
		
		System.out.println(n);
		DFS(n-1); //자기가 자기를 호출함 재귀함수 Recursive: 재귀함수는 반복문의 형태
	}
}
