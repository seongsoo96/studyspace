package io.thisisjava.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/io/thisisjava/fileinputstream/FileInputStreamExample.java");
			int data;
			
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			System.out.flush();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
