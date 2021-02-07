package java14_net.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class File_Client_Answer {
	public static void main(String[] args) {
	
		Socket sock = null; //클라이언트 소켓 객체
		
		OutputStream out = null; //소켓 출력 스트림 객체
		
		FileInputStream in = null; //입력 스트림 객체
		
		// 입력 대상 파일
		File file = new File("./src/java14_net/quiz", "data.txt");
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			
			// 접속 요청
			sock = new Socket("localhost", 5000);

			// 출력 스트림 개설
			out = sock.getOutputStream();

			// 입력 스트림 개설
			in = new FileInputStream(file);
			
			// ----- 데이터 통신 -----
			int len = -1;
			byte[] buf = new byte[1024];
			
			while( (len = in.read(buf)) != -1 ) {
				String str = new String(buf, 0, len);
				out.write(str.getBytes());
			}
		
			System.out.println("+ + + 통신 완료 + + +");
			// --------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] 알 수 없는 호스트입니다");
		} catch (IOException e) {
			System.out.println("[ERROR] 소켓 생성 실패, 서버와 통신할 수 없습니다");
		} finally {
			try {
				if(out!=null)	out.close();
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 자원 해제 실패");
			}
		}		

	}
}
