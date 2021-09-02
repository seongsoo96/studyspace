package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedStream {
	public static void main(String[] args) {
		
		//입력 대상 파일
		File file = new File("./src/java13_io/filterStream", "source.txt");
		System.out.println("[TEST] exists: " + file.exists());
		
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차 스트림, 성능 향상 보조스트림
		
		//파일 입력관련 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼 (데이터 관리 용이)
		int len = -1; //입력 데이터의 길이
		
		try {
			//파일 입력 스트림 생성 (1차, 2차)
//			fis = new FileInputStream(file); // File -> FileInputStream
//			bis = new BufferedInputStream(fis); //FileInputStream -> BufferedInputStream
			
			bis = new BufferedInputStream( new FileInputStream(file) );
			
			//파일 입력
			while((len = bis.read(buf)) != -1) {
				System.out.print( new String(buf, 0, len) );
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close(); //스트림 닫기
//				fis.close(); //스트림 닫기
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}
