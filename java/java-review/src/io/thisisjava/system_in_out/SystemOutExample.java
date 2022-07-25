package io.thisisjava.system_in_out;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		for(byte b = 48; b<58; b++) {
			os.write(b);
		}
		
		os.write(13);
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(13);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		
	}
}
