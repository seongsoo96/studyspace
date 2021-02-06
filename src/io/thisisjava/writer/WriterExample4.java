package io.thisisjava.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample4 {
	
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./src/io/thisisjava/test.txt");
		
		String data = "안녕 자바 프로그램";
//		writer.write(data);
		writer.write(data, 2, 5);
		
		writer.flush();
		writer.close();
		
	}
}
