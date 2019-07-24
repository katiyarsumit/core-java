package com.datastructure;

public class LinkedQueueDemo {
public static void main(String[] args) throws Exception {
	LinkedQueue lq=new LinkedQueue();
	lq.enQueue(20);
	lq.enQueue(10);
	lq.enQueue(40);
	lq.enQueue(30);
	lq.enQueue(60);
	lq.enQueue(70);
	lq.enQueue(50);
	System.out.println(lq.length);
	System.out.println("first : "+lq.getFirst());
	System.out.println("last : "+lq.getLast());
	lq.show();
}
}
