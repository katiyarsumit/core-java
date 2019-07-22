package com.exception;


abstract class Cricket{
public Cricket(){
	System.out.println("abstract class constructer");
	int x=0;
}	
abstract public void m1();
}
 class Team extends Cricket{
	public void m1(){
		System.out.println("this is implemented method");
	}
 }



public class ThisAndSuperKeyword {
	public static void main(String[] args){
		Team t=new Team();
		
	}

}
