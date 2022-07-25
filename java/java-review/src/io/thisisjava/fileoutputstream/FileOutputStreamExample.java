package io.thisisjava.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "./src/io/thisisjava/fileoutputstream/house.jpg";
		String targetFileName = "/Users/ssl/Desktop/house.jpg";
		
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while( (readByteNo=fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
		
		
	}
}
