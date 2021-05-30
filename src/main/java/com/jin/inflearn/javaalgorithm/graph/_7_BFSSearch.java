/**
 * 
 */
package com.jin.inflearn.javaalgorithm.graph;

/**
 * @author njh
 *
 */

/* class Node는 이미 _5_DFSSearch에서 선언한 클래스 이므로 여기서 다시 선언할 필요가 없다
 * class Node{ int data; Node lt, rt;
 * 
 * public Node(int val) { data=val; lt=rt=null; } }
 */


public class _7_BFSSearch {

	Node root;
	
	public void BFS(Node root) {
		
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
