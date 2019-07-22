package com.thread;

import java.util.LinkedList;

public class ProducerAndConsumer {
public static void main(String[] args) throws InterruptedException {
	Storage storare=new Storage();
	
	Thread producerThread=new Thread(){
		public void run(){
			try {
				storare.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	Thread consumerThread=new Thread(){
		public void run(){
			try {
				storare.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	producerThread.start();
	consumerThread.start();
}
}

class Storage{
	LinkedList<Integer> list=new LinkedList<Integer>();
	int capacity=2;

	public void produce() throws InterruptedException{
		int value=0;
		 while (true) 
         {
		synchronized (this) {
			if(list.size()==capacity){
				wait();
			}
			list.add(value++);
			System.out.println("value produced by producer is : "+ value);
			notify();
			Thread.sleep(1000);
		}
         }
	}
	
	public void consume() throws InterruptedException{
		 while (true) 
         {
		synchronized (this) {	
		if(list.size()==0){
			wait();
		}
		int removeValue=list.removeFirst();
		System.out.println("value consumed by consumer : "+removeValue);
		notify();
		Thread.sleep(1000);
	}
	}
	}
}
