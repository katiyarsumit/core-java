package com.datastructure;

public class FixedSizeArrayQueueDemo {
public static void main(String[] args) throws Exception {
	FixedSizeArrayQueue fsaq=new FixedSizeArrayQueue();
	fsaq.enQueue(10);
	fsaq.enQueue(20);
	fsaq.enQueue(30);
	fsaq.enQueue(40);
	fsaq.enQueue(50);
	
	System.out.println(fsaq.isEmpty());
	System.out.println(fsaq.isFull());
	System.out.println(fsaq.size());
	System.out.println(fsaq.show());
	
System.out.println("deleted record : "+fsaq.deQueue());
System.out.println(fsaq.isEmpty());
System.out.println(fsaq.isFull());
System.out.println(fsaq.size());
System.out.println(fsaq.show());
}
}
