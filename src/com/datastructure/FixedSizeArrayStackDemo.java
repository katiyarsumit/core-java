package com.datastructure;

public class FixedSizeArrayStackDemo {
public static void main(String[] args) throws Exception {
	FixedSizeArrayStack fsas=new FixedSizeArrayStack();
	fsas.push(3);
	fsas.push(5);
	fsas.push(7);
	fsas.push(2);
	fsas.push(9);
	fsas.show(fsas);
}
}
