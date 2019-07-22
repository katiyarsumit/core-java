package com.datastructure;

public class LinkedStack {
private Node top;
private int length;

public LinkedStack(){
	top=null;
	length=0;
}

public void push(int data){
	Node node=new Node(data);
	node.setNext(top);
	top=node;
	length++;
}

public int pop() throws Exception{
	if(isEmpty()){
		throw new Exception("stcak is empty");
	}
	int result=top.getData();
	Node node=top;
	top=node.getNext();
	length--;
	return result;
}

public int peek() throws Exception{
if(isEmpty()){
	throw new Exception("stack is empty");
}
return top.getData();
}

public boolean isEmpty(){
	return (length==0);
}

public int size(){
	return length;
}

public int top(){
	return length;
}

public String toString(){
	String str="";
	Node node=top;
	while(node!=null){
		str=str+node.getData()+" - >> ";
		node=node.getNext();
	}
	return str;
}

}
