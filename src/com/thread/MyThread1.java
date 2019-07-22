package com.thread;

public class MyThread1 extends Thread{
int count=0;
	public void run(){
		for(int i=0;i<5;i++){
	System.out.println("this is child thread");
		}
}
}
