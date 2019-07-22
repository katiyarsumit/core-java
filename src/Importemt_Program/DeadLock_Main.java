package Importemt_Program;

public class DeadLock_Main {
public static void main(String[] args) {
	String resourse1="resourse 1";
	String resourse2="resourse 2";
	
	Thread t1=new Thread(){
		public void run(){
			synchronized (resourse1) {
				System.out.println(Thread.currentThread().getName() + " got lock on resourse 1");
		
				System.out.println(Thread.currentThread().getName()+ " waiting for resourse 2");
				
			synchronized (resourse2) {
				System.out.println(Thread.currentThread().getName() + " got lock of resourse 2");	
			}
		}
		}
	};
	
	Thread t2=new Thread(){
		public void run(){
			synchronized (resourse2) {
				System.out.println(Thread.currentThread().getName()+" got the lock of resourse 2");
				System.out.println(Thread.currentThread().getName() +" waiting for resourse 1");
				synchronized (resourse1) {
					System.out.println(Thread.currentThread().getName()+ " got lock of resourse1");
				}
			}
			
		}
	};
	t1.start();
	t2.start();
}
}
