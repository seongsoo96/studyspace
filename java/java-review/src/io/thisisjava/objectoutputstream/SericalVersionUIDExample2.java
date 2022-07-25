package io.thisisjava.objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SericalVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./src/io/thisisjava/objectoutputstream/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close();
		fis.close();
		
		
	}
}
