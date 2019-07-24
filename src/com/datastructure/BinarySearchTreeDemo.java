package com.datastructure;

public class BinarySearchTreeDemo {
public static void main(String[] args) {
	BinarySearchTree bst=new BinarySearchTree();
	bst.insert(10);
	bst.insert(2);
	bst.insert(59);
	bst.insert(33);
	bst.insert(11);
	bst.insert(23);
	bst.insert(58);
	bst.insert(98);
	bst.traverse();
}
}
