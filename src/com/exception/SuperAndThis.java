package com.exception;
class Manager{
	
	Manager(){
		System.out.println(" this is parent classs constructor");
	}
}

class Lead extends Manager{
	Lead(){
		this("my name is sumit katiyar");
	}
	Lead(String name){
		System.out.println(name);
	}
}


public class SuperAndThis {
public static void main(String[] args) {
	Lead l=new Lead();
}
}
