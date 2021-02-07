package io.thisisjava.objectinputsteam_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("./src/io/thisisjava/objectinputsteam_objectoutputstream/Object.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close();
		
		FileInputStream fis = new FileInputStream("./src/io/thisisjava/objectinputsteam_objectoutputstream/Object.dat");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//출력한 순서 그대로 입력한다
		Integer obj1 = (Integer)ois.readObject();
		Double obj2 = (Double)ois.readObject();
		int[] obj3 = (int[])ois.readObject();
		String obj4 = (String)ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + ", " + obj3[1] + ", " + obj3[2]);
		System.out.println(obj4);
		
	} 
}
