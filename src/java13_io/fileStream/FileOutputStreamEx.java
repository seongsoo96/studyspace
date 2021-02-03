package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java13_io/fileStream", "output");
		System.out.println("[TEST] exists : " + file.exists());
		
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file); //스트림 생성
			
			
			//파일 출력 - 데이터를 파일로 저장한다
			String str = "cherry";
			fos.write(str.getBytes(), 0, str.length());
			fos.flush(); //버퍼 비우기
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close(); //스트림 닫기
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		
		
		
		
	}
}
