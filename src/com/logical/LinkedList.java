package com.logical;

public class LinkedList<T> {
Node<T> header;
public void insert(T data){
	Node<T> node=new Node<T>();
	node.data=data;
	node.next=null;
	if(header==null){
		header=node;
	}else{
		Node<T> n=header;
		while(n.next!=null){
			n=n.next;
		}
		n.next=node;
	}
}

public void get(){
	if(header==null){
		System.out.println("null");
	}else{
		Node<T> n=header;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

}
