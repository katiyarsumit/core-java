package com.logical;

public class SwappingWithoutValiable {
public static void main(String[] args) {
	int i=22;
	int j=33;
	i=i+j;
	j=i-j;
	i=i-j;
	System.out.println("value of i : "+ i);
	System.out.println("value of j : "+ j);
}
}
