package com.exception;

class Employee<T>{
	T t;
	public Employee(T t) {
	this.t=t;
	}
	T getData(){
		return t;
	}
	
}
public class TypeCastingDemo {
public static void main(String[] args) {

	Employee<String> e=new Employee<String>("sumit");
	System.out.println(e.getData());
	Employee<Integer> e1=new Employee<Integer>(10);
	System.out.println(e1.getData());
	
}
}
