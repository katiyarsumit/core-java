package com.logical;

public class SwappingUsingValiable {
public static void main(String[] args) {
	int i=10;
	int j=33;
	int k=0;
		k=i+j;
		i=k-i;
		j=k-j;
	System.out.println("value of i is : "+i);
	System.out.println("value of j is : "+j);
}
}
