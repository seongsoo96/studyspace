package io.thisisjava.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("./src/io/thisisjava/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[2];
		String data ="";
		while( (readCharNo=reader.read(cbuf)) != -1 ) {
			data += new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		System.out.println(data);
		reader.close();
	}
}  
