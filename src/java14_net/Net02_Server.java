package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Net02_Server {
	public static void main(String[] args) {
		
		ServerSocket serverSock = null; //서버 리슨 소켓
		Socket sock = null; //서버 통신 소켓
		
		BufferedReader in = null; //소켓 입력 스트림
		
		try {
			serverSock = new ServerSocket(10001);
			System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
			
			System.out.println(" --- Listening ---");
			sock = serverSock.accept(); //리슨 시작, 클라이언트를 기다림
			
			// --- BLOCKED 상태가 된다 ---
			// 다음 코드로 진행되지 않고 멈춰있는 상태
			// ---------------------------
			
			System.out.println("\n --- 클라이언트 접속 완료 ---");
			
			// ---- 데이터 통신 ----
			// sock.getInputStream()	- 통신용 입력 스트림 (InputStream)
			// sock.getOutputStream()	- 통신용 출력 스트림 (OutputStream)
			
			// 클라이언트가 전송한 문자열을 입력 받아서 모니터로 출력
			in = new BufferedReader( 
					new InputStreamReader( sock.getInputStream() ));
			
			String msg = in.readLine();
			System.out.println("\n\t>>전송받은 데이터 : " + msg);
					
			
			//----------------------------
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sock.close(); //통신 소켓 닫기
				serverSock.close(); //리슨 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
