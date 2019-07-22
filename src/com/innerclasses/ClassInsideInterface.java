package com.innerclasses;

import com.innerclasses.Demo12.Service;

interface Demo12{
	public void m1(Service s);
	
	class Service{
	public void m2(){
		System.out.println("this is method 2");
	}
	}
}

public interface ClassInsideInterface {
public static void main(String[] args) {
	Demo12 d=new Demo12(){
		public void m1(Service s){
			s.m2();
		};		
	};
	d.m1(new Service());
}
}
