package com.thread;


public class MainThread1 {
public static void main(String[] args) throws InterruptedException {
MyThread1 mt1=new MyThread1();
mt1.start();
mt1.resume();
for(int i=0;i<=5;i++){
	System.out.println("this is main thread");
}
mt1.resume();
}
}
