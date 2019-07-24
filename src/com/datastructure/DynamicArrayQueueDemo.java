package com.datastructure;

public class DynamicArrayQueueDemo {
public static void main(String[] args) throws Exception {
	DynamicArrayQueue daq=new DynamicArrayQueue();
	daq.enQueue(2);
	daq.enQueue(8);
	daq.enQueue(6);
	daq.enQueue(9);
	daq.enQueue(3);
	daq.enQueue(11);
	daq.enQueue(61);
	daq.enQueue(93);
	daq.enQueue(34);
	daq.enQueue(15);
	daq.enQueue(98);
	daq.show();
	System.out.println("#######################");
	daq.deQueue();
	System.out.println("capacity : " +daq.capacity);
	daq.show();


	

	
}
}
