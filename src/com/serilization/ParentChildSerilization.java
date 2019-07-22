package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Lion {
	String name1="Babbar Sher";
}

class Lioness extends Lion implements Serializable{
	private static final long serialVersionUID = 1L;
	String name2="Sherni";
}

public class ParentChildSerilization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	String path="C:/Users/nz161/Desktop/java/serilization.txt";
	Lioness l=new Lioness();
	FileOutputStream fos=new FileOutputStream(path);
	@SuppressWarnings("resource")
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(l);
	
	FileInputStream fis=new FileInputStream(path);
	@SuppressWarnings("resource")
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	
	Lioness l1=(Lioness)o;
	System.out.println(l1.name1);
	System.out.println(l1.name2);
}
}
