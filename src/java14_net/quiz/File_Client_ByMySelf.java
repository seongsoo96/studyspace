package java14_net.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class File_Client_ByMySelf {
	public static void main(String[] args) {
		
		Socket sock = null;
		OutputStream out = null;
		File file = new File("./src/java14_net/quiz/data.txt");
//		System.out.println(file.exists()); //파일 존재 확인
		FileInputStream in = null;
		
		//Socket 생성
		try {
			sock = new Socket("localhost", 8000);
			System.out.println("서버 소켓과 연결 성공");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일 입력 스트림
		try {
			in = new FileInputStream(file); //파일을 클라이언트 입력스트림으로 받아들임
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//파일 출력 스트림
		try {
			out = sock.getOutputStream();
			
			int readBytesNo;
			byte[] bytes = new byte[100];
			
			while((readBytesNo = in.read(bytes)) != -1) {
				out.write(bytes);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.flush();
				in.close(); out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
