package com.exception;

public class RecursiveCall {
	public static void main(String[] args) {
		m1(20);
	}
public static void m1(int x){
	while(x>10){
		System.out.println("value of x is : "+x);
		x=x-1;
		m1(x);
		break;
	}
	
}
}
