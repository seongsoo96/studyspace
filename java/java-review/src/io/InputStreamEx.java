package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		
		byte[] buf = new byte[10];
		int len = -1;
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("<<입력 대기중>>");
		
		try {
			
			while( (len = is.read(buf)) != -1 ) {
				sb.append( new String(buf, 0, len));
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("<< 입력된 데이터 >>");
		System.out.println(sb);
		
	
		
		
		
		
		
		
	}
}
