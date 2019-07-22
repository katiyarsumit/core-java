package Importemt_Program;

import java.util.LinkedList;

class Storage{
	LinkedList<Integer> list=new LinkedList<Integer>();
	int capacity=1;
	
	public void produce() throws InterruptedException{
		int producedValue=0;
		synchronized (this) {
			
		
		if(list.size()==capacity){
			wait();
		}
		
		System.out.println("producer produced value "+producedValue);
		list.add(producedValue++);
		notify();
		Thread.sleep(1000);
	}
	}
	
	public void consume() throws InterruptedException{
		synchronized (this) {
			if(list.size()==0){
				wait();
			}
			int consumedValue=list.removeFirst();
			System.out.println("consumer consumed value " +consumedValue);
			Thread.sleep(1000);
		}
	}
	
}

public class ProducerConsumerMain {
public static void main(String[] args) {
	Storage store=new Storage();
Thread t1=new Thread(){
	public void run(){
		try {
			store.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
};
Thread t2=new Thread(){
	public void run(){
	 try {
		store.consume();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}
};
t1.start();
t2.start();
	
}
}
