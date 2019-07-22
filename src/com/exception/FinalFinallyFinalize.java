package com.exception;

class Test{
	int x=10;
	int y=20;
	int z=50; 
	public int add(){
	System.out.println("test class add method executed");
		return x+y;
	}
}
class TestExtend extends Test{
public int add(){
	z=88;
	return z;
}
}
public class FinalFinallyFinalize{
public static void main(String[] args) {
TestExtend te=new TestExtend();
System.out.println(te.add());
}
}
