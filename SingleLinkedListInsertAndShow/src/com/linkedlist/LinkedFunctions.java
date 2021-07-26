package com.linkedlist;

public class LinkedFunctions {

	public Node1 NodeCreation(int i) {
		Node1 a = new Node1();
		a.i = i;
		a.next = null;
		return a;
	}

	public Node1 insert(int i, Node1 node) {
		if (node == null) {
			return NodeCreation(i);
		} else {
			node.next = insert(i, node.next);
		}
		return node;

	}

	public void printlist(Node1 root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.i);
			printlist(root.next);
		}

	}

	public Node1 insertAtFirst(int i, Node1 root) {
		Node1 newnode = NodeCreation(i);
		newnode.next = root;
		return newnode;
	}

	/*
	 * public Node1 insertAtEnd(int i, Node1 root) { Node1 newnode =
	 * NodeCreation(i); //newnode.next = root; while(root.next==null) {
	 * root.next=newnode; System.out.println(root.i); } return newnode; }
	 */
}
