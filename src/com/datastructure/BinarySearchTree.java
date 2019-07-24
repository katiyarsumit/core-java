package com.datastructure;

public class BinarySearchTree {

	private BinaryNode root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int data){
		BinaryNode node=new BinaryNode(data);
		BinaryNode pointer=root;
		if(root==null){
			root=node;
		}else{
			while(pointer!=null){
				if(data>pointer.getData()){
					if(pointer.getRight()==null){
						pointer.setRight(node);
						break;
					}else{
						pointer=pointer.getRight();
					}
				}
				else if(data<pointer.getData()){
					if(pointer.getLeft()==null){
						pointer.setLeft(node);
						break;
					}else{
						pointer=pointer.getLeft();
					}
				}
				else{
					System.out.println("duplicate value is not allowed");
					break;
				}
			}
			
		}
	}
	

	public void preOrder(BinaryNode pointer){
		if(pointer==null){
			return;
		}
		System.out.println("\t"+ pointer.getData());
		preOrder(pointer.getLeft());
		preOrder(pointer.getRight());
	}
	
	public void traverse(){
		preOrder(root);
	}
}
