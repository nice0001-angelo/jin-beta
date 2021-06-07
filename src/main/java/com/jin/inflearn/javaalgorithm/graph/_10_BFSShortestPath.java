/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

import java.util.*;

/**
 * @author njh
 *
 */
public class _10_BFSShortestPath {
	Node root;
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		Q.offer(root);
		int L=0;
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0; i<len; i++) {
				Node cur=Q.poll();
				if(cur.lt==null && cur.rt==null) return L;
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.add(cur.rt);
			}
			L++;
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_10_BFSShortestPath tree = new _10_BFSShortestPath();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}


