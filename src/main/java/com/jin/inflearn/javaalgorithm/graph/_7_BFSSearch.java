/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author njh
 *
 */

/* class Node는 이미 _5_DFSSearch에서 선언한 클래스 이므로 여기서 다시 선언할 필요가 없다
 * class Node{ 
 * int data; 
 * Node lt, rt;
 * 
 * public Node(int val) { //Constructor
 * data=val; 
 * lt=rt=null; 
 * } 
 * }
 */


public class _7_BFSSearch {

	Node root;
	
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L=0;  //레벨
		while(!Q.isEmpty()) {
			int len=Q.size();
			System.out.print(L+" : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) { //cur의 현재 왼쪽자식이 있는지 체크: 없다면 말단이므로 큐에 넣을게 없음
					Q.offer(cur.lt);
				}
				if(cur.rt!=null) { //cur의 현재 오른쪽 자식이 있는지 케크: 없다면 말단이므로 큐에 넣을게 없음
					Q.offer(cur.rt);
				}
			}
			L++; //레벨 증가
			System.out.println();
		}
	}

	public static void main(String[] args) {
		_7_BFSSearch tree = new _7_BFSSearch();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}

}
