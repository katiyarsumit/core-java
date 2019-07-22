package com.exception;

public class ExceptionMethods {
public static void main(String[] args) {
result();
	}

public static void result(){
	try{
		System.out.println("try block executed");
		try{
			System.out.println("nested try block executed");
			
		}catch (Exception e) {
			
		}
	}
	catch(Exception e){
		System.out.println("catch block executed1");
	try{
		System.out.println("try inside catch");
	}catch (NullPointerException e1) {
		
	}
	}
	
	finally{
		System.out.println("finally block executed ");
	
	}
}
}
