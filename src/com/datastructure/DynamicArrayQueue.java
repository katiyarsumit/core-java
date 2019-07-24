package com.datastructure;

public class DynamicArrayQueue {
private int size;
private int front;
private int rear;
private int[] queueRep;
public int capacity;
private static final int CAPACITY=5;
private static final int incement=2;
private static final int decrement=2;
public DynamicArrayQueue() {
this(CAPACITY);
}

public DynamicArrayQueue(int capa){
	this.capacity=capa;
	queueRep=new int[capacity];
	front=0;
	rear=0;
	size=0;
}

public void enQueue(int data) throws Exception{
	if(size==capacity){
		expand();
	}
	size++;
	queueRep[rear]=data;
	rear++;
}

public int deQueue() throws Exception{
	if(size()==0){
		throw new Exception("queue is empty");
	}
	size--;
	int data=queueRep[front];
	queueRep[front]=Integer.MIN_VALUE;
	front=front+1;
	shrink();
	return data;
}



public void expand(){
	int length=size;
	int[] newQueue=new int[capacity*incement];
	System.arraycopy(queueRep,0,newQueue,0, length);
	queueRep=newQueue;
	this.capacity=this.capacity*incement;
}

public void shrink(){
	int length=size();
	if(length<=(capacity/2)){
		this.capacity=capacity/decrement;
		int[] newQueue=new int[capacity];
		System.arraycopy(queueRep,front,newQueue,0,length);
		queueRep=newQueue;
		front=0;
	}
}

public void show(){
	for(int i=front;i<capacity;i++){
		System.out.println(queueRep[i]);
	}
}

public int size(){
	return size;
}

public boolean isEmpty(){
	return size==0;
}

public boolean isFull(){
	return size==capacity;
}

}
