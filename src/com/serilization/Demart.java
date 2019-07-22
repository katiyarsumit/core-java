package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NewCustomer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int productId;
	String productName;
	transient int price;
public NewCustomer(int productId,String productName,int price) {
this.productId=productId;
this.productName=productName;
this.price=price;
}

private void writeObject(ObjectOutputStream oos) throws IOException{
	int finalPrice=0;
	if("Tea".equals(productName)){
		price=price-20;
	}else{
		price=price;
	}
	oos.defaultWriteObject();
	oos.writeObject(price);
}

private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
	ois.defaultReadObject();
	price=(int) ois.readObject();
}

}

public class Demart {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	NewCustomer nc=new NewCustomer(01,"Tea",100);
	String path="C:/Users/nz161/Desktop/java/serilization.txt";
	FileOutputStream fos = new FileOutputStream(path);
	@SuppressWarnings("resource")
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(nc);
	FileInputStream fis=new FileInputStream(path);
	@SuppressWarnings("resource")
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	NewCustomer nc1=(NewCustomer)o;
	System.out.println(nc1.productId + " " + nc1.productName + " " + nc1.price);
}
}
