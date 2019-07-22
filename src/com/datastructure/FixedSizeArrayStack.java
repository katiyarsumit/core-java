package com.datastructure;

public class FixedSizeArrayStack {
	
protected int capacity;
public static final int CAPACITY=5;
protected int[] stackRep;
protected int top=-1;

public FixedSizeArrayStack(){
	this(CAPACITY);
}

public FixedSizeArrayStack(int capa) {
	capacity=capa;
stackRep=new int[capacity];
}

public int size(){
	return (top+1);
}

public void push(int data) throws Exception{
	if(size()==capacity){
		throw new Exception("Stack Is Full");
	}else{
		stackRep[++top]=data;
	}
}

public void show(FixedSizeArrayStack fsas){
	if(top>0){
		while(top>=0){
		System.out.println(stackRep[top--]);
		}
	}else{
		System.out.println(0);
	}
}

public boolean isEmpty(){
	return top<0; 
}
}
