package com.logical;

public class ReverseStringByRecursive {
public static void main(String[] args) {
String message="hi this is sumit katiyar";
System.out.println(reverseString(message));
	
}

public static String reverseString(String message){
	String reverse="";

		reverse=reverse+message.charAt(message.length()-1)+
		reverseString(message.substring(0,message.length()-1));
	
	return reverse;
}

}
