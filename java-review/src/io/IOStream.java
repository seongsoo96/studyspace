package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		OutputStream os = System.out;
		
		byte[] buf = new byte[1024];
		int len = -1;
		
	
			
			try {
				while( (len=is.read(buf)) != -1 ) {
					
					os.write(buf, 0, len);
					os.flush();
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	
		
		
		
		
		
	}
}
