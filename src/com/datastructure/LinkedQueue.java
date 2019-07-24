package com.datastructure;

public class LinkedQueue {
public int length;
private Node front;
private Node rear;

public LinkedQueue(){
	length=0;
	front=null;
	rear=null;
}

public void enQueue(int data){
	Node node=new Node(data);
	if(isEmpty()){
		front=node;
	}else{
		rear.setNext(node);
	}
	rear=node;
	length++;
}

public int deQueue() throws Exception{
	if(isEmpty()){
		throw new Exception("queue is empty");
	}
	int data=front.getData();
	front=front.getNext();
	length--;
	if(isEmpty()){
		rear=null;
	}
		return data;
}

public int getFirst() throws Exception{
	if(isEmpty()){
		throw new Exception("queue is empty");
	}
	return front.getData();
}

public int getLast() throws Exception{
	if(isEmpty()){
		throw new Exception("queue is empty");
	}
	
	return rear.getData();
}

public boolean isEmpty(){
	return length==0;
}

public void show(){
	if(isEmpty()){
		System.out.println("queue is empty");
	}
	else{
		Node node=front;
		while(node.getNext()!=null){
			System.out.println(node.getData());
			node=node.getNext();
		}
		System.out.println(node.getData());
	}
	
}

}
