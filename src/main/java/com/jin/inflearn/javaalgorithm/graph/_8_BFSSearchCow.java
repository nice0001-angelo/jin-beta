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
		ch=new int[10001];
		ch[s]=1;
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()){
			int len=Q.size();
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		_8_BFSSearchCow T = new _8_BFSSearchCow();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();//출발점(Start)
		int e=kb.nextInt();//목표점(End)
		System.out.println(T.BFS(s,e));
	}

}
