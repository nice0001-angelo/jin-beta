/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

import java.util.*;

import com.jin.inflearn.javaalgorithm.array.*;

/**
 * @author njh
 *
 */
public class _8_BFSSearchCow {

	int answer=0;
	int[] dis= {-1,1,5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s, int e) {
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		_8_BFSSearchCow T = new _8_BFSSearchCow();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s,e));
	}

}
