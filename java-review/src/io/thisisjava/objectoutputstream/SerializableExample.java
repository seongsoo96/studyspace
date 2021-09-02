package io.thisisjava.objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("./src/io/thisisjava/objectoutputstream/Object.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush(); oos.close();
		
		FileInputStream fis = new FileInputStream("./src/io/thisisjava/objectoutputstream/Object.dat");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4); 
		
	}
}
