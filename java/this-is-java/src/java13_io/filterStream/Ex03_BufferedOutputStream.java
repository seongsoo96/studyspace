package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java13_io/filterStream", "bufferedOut.txt");
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null; //1차 스트림
		BufferedOutputStream bos = null; //2차 스트림, 성능 향상 보조 스트림
		
		try {
			//파일 출력 스트림 생성
//			fos = new FileOutputStream(file); //쓰기모드(파일을 첨부터 작성)
			fos = new FileOutputStream(file, true); //추가모드(파일의 끝부터 작성)
			bos = new BufferedOutputStream(fos);
			
			//파일 출력
			String data = "Cherry";
			bos.write( data.getBytes(), 0, data.length() );
			bos.flush(); //출력 버퍼 비우기
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
