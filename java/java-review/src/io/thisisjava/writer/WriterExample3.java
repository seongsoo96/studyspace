package io.thisisjava.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample3 {
	
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./src/io/thisisjava/test.txt");
		char[] data = "홍길동김개똥".toCharArray();
		writer.write(data, 2, 3);
		
		writer.flush();
		writer.close();
		
	}
}
