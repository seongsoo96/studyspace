package io.thisisjava.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		InputStream is= new FileInputStream("./src/io/thisisjava/test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
	}
}
