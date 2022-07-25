package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //키보드 표준 입력 스트림 객체
		
		byte[] buf = new byte[10]; //입력 데이터의 저장소(read의 매개변수)
		int len = -1; //입력받은 데이터의 길이(read의 반환데이터)
		
		// len의 기본값을 -1로 둔 이유
		//	read메소드의 반환값으로 -1 이 EOF를 나타내는 특별한 값으로 쓰인다
		
		StringBuilder sb = new StringBuilder(); //입력 데이터 전체 저장
		
		System.out.println("<< 입력 대기중 >>");
		try {
			
			//입력 스트림에 입력받을 데이터가 존재한다면 계속 반복한다
			while( (len = is.read(buf)) != -1 ) {
				
				//입력한 데이터를 모니터에 출력하기
//				System.out.println( new String(buf, 0, len) );
				
				//입력한 데이터를 StringBuilder에 저장하기
				sb.append( new String(buf, 0, len) );
				
				// EOF를 키보드로 직접 입력해야 종료된다
				//	-> ctrl + d
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close(); //스트림 닫기, 해제
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("<< 입력된 데이터 >>");
		System.out.println( sb );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
