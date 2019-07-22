package com.exception;
class Parent{
	void m1(String msg){
		System.out.println("this is parent class message" + msg);
	}
}
class Child extends Parent{
	public void m1(String msg){
		System.out.println("abstract implemented method");
	}

}
public class Main {
	public static void main(String[] args) {
		Child c=new Child();
		c.m1(" sumit katiyar");
	}
}
