package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//class File의 생성자
		
		//	File(String path, String filename) - 경로, 파일명
		//	File(File path, String filename) - 경로객체, 파일명
		
		//	File(String filepath) - 경로+파일명
		
		//---------------------------------------------------------
		
		File file1 = new File(
				"/Users/ssl/eclipse-workspace/JavaBasic/src/java13_io/file"
				, "Hello");
		
		System.out.println( file1.length() );
		System.out.println( file1.exists() );
		
		
		
		
		System.out.println("-------------------------");
		
		File file2 = new File(
				"./src/java13_io/file"
				, "Hello");
		
		System.out.println( file2.length() );
		System.out.println( file2.exists() );
		
		
		
		
		
		
	}
}
