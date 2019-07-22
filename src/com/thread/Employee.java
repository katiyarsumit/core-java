package com.thread;

public class Employee {

public synchronized void emppName(String name) throws InterruptedException{
	for(int i=0;i<5;i++){
		Thread.sleep(1000);
	System.out.println("Employee name is  : "+name +" thread : "+ Thread.currentThread().getName());
}	
}

public void emppName1(String name) throws InterruptedException{
	for(int i=0;i<5;i++){
		Thread.sleep(1000);
	System.out.println("customer name is  : "+name +" thread : "+ Thread.currentThread().getName());
}	
}

}
