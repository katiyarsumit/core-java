package com.thread;


// program to explain deadlock

public class DeadLock {

public static void main(String[] args) {
	final String resourse1="resourse-1";
	final String resourse2="resourse-2";
	Thread t1=new Thread(){
		public void run(){
			synchronized(resourse1){
				System.out.println(Thread.currentThread().getName()+" got lock of 1 " + resourse1);
				
				System.out.println(Thread.currentThread().getName()+" waiting for lock of 2 "+ resourse2);
				synchronized (resourse2) {
				System.out.println(Thread.currentThread().getName()+" got lock of 3 "+ resourse2);	
				}
				
			}
		}
	};
	
	Thread t2=new Thread(){
		public void run(){
			synchronized(resourse2){
				System.out.println(Thread.currentThread().getName()+" got lock of 11 "+ resourse2);
				System.out.println(Thread.currentThread().getName()+" waiting for lock of 22 "+ resourse1);
				synchronized (resourse1) {
				System.out.println(Thread.currentThread().getName()+" got lock of 33 "+ resourse1);	
				}
				
			}
		}
	};
	t1.start();
	t2.start();
}

}

/*
 *QUE- how to resolve deadlock condition
 *ANS- there is not any specific keyword to remove deadlock condition but we can use some protection like there should not circular call for resourses from multiple thread
 *
 *  in above example we can resolve deadlock condition by replace (resourse2 to resourse1 and resourse1 to resourse2 )in thread t2. then only one thread will we execute at a time
 * 
 * */
