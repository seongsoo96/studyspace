package io.thisisjava.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample2 {
	
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./src/io/thisisjava/test.txt");
		char[] data = "홍길동김개똥".toCharArray();
		writer.write(data);
		
		writer.flush();
		writer.close();
		
	}
}
