package com.thread;

public class MyThread extends Thread{
	Employee e;
	String name;
	public MyThread(Employee e,String name) {
	this.name=name;
	this.e=e;
	}
public void run(){
	
	try {
		e.emppName(name);
		e.emppName1(name);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
