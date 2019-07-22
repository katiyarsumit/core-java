package com.thread;

public class MainThread {
public static void main(String[] args) {
	Employee e=new Employee();
	MyThread mt=new MyThread(e,"sumit");
	MyThread mt1=new MyThread(e,"ankit");
	mt.start();
	mt1.start();
}
}
