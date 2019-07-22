package com.datastructure;

public class LinkedStackDemo {
public static void main(String[] args) throws Exception {
	LinkedStack ls=new LinkedStack();
	ls.push(10);
	ls.push(20);
	ls.push(30);
	ls.push(40);
	
	System.out.println(ls.isEmpty());
	System.out.println(ls.size());
	System.out.println(ls.top());
	System.out.println(ls.toString());
	
	ls.pop();
	
	System.out.println(ls.isEmpty());
	System.out.println(ls.size());
	System.out.println(ls.top());
	System.out.println(ls.peek());
	System.out.println(ls.toString());
	
	
}
}
