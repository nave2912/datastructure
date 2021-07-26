package com.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedFunctions ll = new LinkedFunctions();
		Node1 root = null;
		root = ll.insert(12, root);
		root = ll.insert(18, root);
		root = ll.insert(22, root);
		/*
		 * System.out.println("iteration 1"); ll.printlist(root);
		 */
		System.out.println("iteration 2,again it will print all values,because first iteration completed with null(next element is null) check");
		root = ll.insert(4, root);
		root=ll.insertAtFirst(1,root);
	//	root=ll.insertAtEnd(100,root);
		ll.printlist(root);
	}
}
