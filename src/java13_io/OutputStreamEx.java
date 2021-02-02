package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		OutputStream os = System.out; //모니터 표준 출력 스트림 객체
		
		byte[] buf = new byte[10]; //출력 데이터 저장소
		int len = 0; //출력할 데이터의 길이
		
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		
		try {
			//데이터 출력
			//	-> 버퍼에 출력한다, 출력 장치로는 안 보내진다
			os.write(buf, 0, len);
			
			//출력 버퍼 비우기
			//	-> 버퍼에 출력된 내용을 출력 장치까지 내보낸다
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
