package com.innerclasses;

class Demo{
	public void m1(){
		System.out.println("hello");
	}
	
	public void m2(){
		System.out.println("hi");
	}
}

public class AnnomousDemo {
public static void main(String[] args) {

	Demo d=new Demo(){
		public void m1(){
			m3();
			System.out.println("Hello this is sumit katiyar");
		}
		
		public  void m3(){
			System.out.println("###########");
		}
	};
	Demo demo=new Demo();
	demo.m1();
	demo.m2();
	d.m1();
	d.m2();
	
}
	
}
