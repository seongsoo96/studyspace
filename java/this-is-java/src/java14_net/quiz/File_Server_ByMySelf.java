package java14_net.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class File_Server_ByMySelf {
	public static void main(String[] args) {
		
		ServerSocket serv = null;
		Socket sock = null;
		
		InputStream is = null;
		File file = new File("./src/java14_net/quiz/receive.txt");
		FileOutputStream out = null;
		
		//serv 생성
		try {
			serv = new ServerSocket();
			serv.bind(new InetSocketAddress(8000));
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println("리슨 대기중");
			sock = serv.accept();
			
			System.out.println("클라이언트 접속 완료");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//Client로부터 파일을 받는 InputStream
		try {
			is = sock.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//is로 받은 file을 읽어서 out을 통해 receive파일에 저장
		try {
			out = new FileOutputStream(file);
			
			int readBytesNo;
			byte[] bytes = new byte[100];
			while( (readBytesNo = is.read(bytes)) != -1 ) {
				out.write(bytes);
			}
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
