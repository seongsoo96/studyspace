package java14_net;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Net03_Client {
	public static void main(String[] args) {
		
		Socket sock = null; //클라이언트 소켓(연결, 통신 모두 사용)
		
		PrintWriter out = null; //소켓 출력 스트림
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
//			sock = new Socket("서버 IP 또는 서버 도메인", 서버포트); //서버에 접속
			
			// 지금 코드에서는 서버를 같은 컴퓨터에서 실행하기 때문에
			// 서버 주소가 아닌 루프백 주소를 사용하고 있다
			// 실제프로그램에서는 반드시 서버IP나 서버도메인을 이용해야한
			
//			sock = new Socket("localhost", 10001); //서버에 접속
			sock = new Socket("127.0.0.1", 10001); //서버에 접속
			
			// --- 데이터 통신 ---
			// sock.getInputStream()	- 통신용 입력 스트림 (InputStream)
			// sock.getOutputStream()	- 통신용 출력 스트림 (OutputStream)
			
			// 서버로 문자열을 전송한다
			out = new PrintWriter(
					new BufferedOutputStream(sock.getOutputStream()), true);
			
//			out.println("Hello");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("전송할 데이터 >> ");
			out.println( sc.nextLine() );
			//--------------------
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
