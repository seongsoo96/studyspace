package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
	public static void main(String[] args) {
		
		//키보드 입력 -> 프로그램 -> 모니터 출력
		
		InputStream is = System.in; //표준 입력 스트림
		OutputStream os = System.out; //표준 출력 스트림
		
		byte[] buf = new byte[1024]; //입출력 데이터 임시 저장소
		int len = -1; //입력 데이터의 길이
		
		try {
			
			//EOF를 만날 때까지 키보드의 입력을 받는다
			while( (len=is.read(buf)) != -1) {
				
				//입력받은 데이터를 모니터로 출력한다
				os.write(buf, 0, len);
				os.flush(); //출력스트림의 버퍼 비우기
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close(); //입력스트림 닫기
				os.close(); //출력스트림 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
