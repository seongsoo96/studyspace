package io.thisisjava.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("./src/io/thisisjava/test.txt");
		
		int readData;
		
		while((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		
		reader.close();
	}
}
