package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog  implements Serializable{
	String name="Dog";
Cat c=new Cat(); 
}

class Cat implements Serializable{
	String name="Cat";
Rat r=new Rat();
}

class Rat implements Serializable{
	String name="Rat";
Goat g=new Goat();
}

class Goat implements Serializable{
	String name="Goat";
}

public class SerilizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="C:/Users/nz161/Desktop/java/serilization.txt";
		Dog d=new Dog();
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("object serilized successfully");
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Dog d1=(Dog)o;
		System.out.println(d1.name);
		Cat c1=d1.c;
		System.out.println(c1.name);
		Rat r1=c1.r;
		System.out.println(r1.name);
		Goat g1=r1.g;
		System.out.println(g1.name);
		
		
	}
}
