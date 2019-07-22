package com.logical;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	System.out.println("Type Somthing Here....");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String userInput=sc.nextLine();
	String reverse="";
	System.out.println(userInput);
	int length=userInput.length();
	for(int i=length-1;i>=0;i--){
		reverse=reverse+userInput.charAt(i);
	}
	System.out.println(reverse);
}
}
