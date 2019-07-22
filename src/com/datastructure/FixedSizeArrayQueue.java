package com.datastructure;

public class FixedSizeArrayQueue {
private int rear;
private int front;
private int size;
private int[] queueRepo;
private int capacity;
private static final int CAPACITY=5;

public FixedSizeArrayQueue(){
	this(CAPACITY);
}

public FixedSizeArrayQueue(int capa){
	this.capacity=capa;
	queueRepo=new int[capacity];
	rear=0;
	front=0;
	size=0;
}

public void enQueue(int data) throws Exception{
	if(size==capacity){
		throw new Exception("queue is full");
	}
	size++;
	queueRepo[rear]=data;
	rear++;
}

public int deQueue() throws Exception{
if(size==0){
	throw new Exception("queue is empty");
}
size--;
int data=queueRepo[front];
queueRepo[front]=Integer.MIN_VALUE;
front++;
return data;
}

public boolean isEmpty(){
	return (size==0);
}

public boolean isFull(){
	return (size==capacity);
}

public int size(){
	return size;
}

public String show(){
	String s="";
	for(int i=front;i<rear;i++){
		s=s+queueRepo[i]+"->> ";
	}
	return s;
}

}
