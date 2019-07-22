package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	String uname="sumit";
	transient String password="12345";
	private void writeObject(ObjectOutputStream os) throws IOException{
		os.defaultWriteObject();
	os.writeObject(password);
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
	ois.defaultReadObject();
	password=(String) ois.readObject();
	}
}

public class CustomSerlization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Customer c=new Customer();
String path="C:/Users/nz161/Desktop/java/serilization.txt";
FileOutputStream fos = new FileOutputStream(path);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(c);
FileInputStream fis=new FileInputStream(path);
ObjectInputStream ois=new ObjectInputStream(fis);
Object o=ois.readObject();
Customer c1=(Customer)o;
System.out.println(c1.uname);
System.out.println(c1.password);

}
}
