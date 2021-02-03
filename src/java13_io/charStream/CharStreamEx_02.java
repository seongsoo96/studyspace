package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//입출력 문자 스트림
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in)); //키보드 입력
		
		PrintWriter out = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(System.out)), true); //모니터 출력
		//** PrintWriter의 생성자에서 autoFlush 설정을 넣을 수 있다
		//	print, println, printf 메소드로 출력하면 자동 flush
		
//		in.readLine(); //입력 메소드
//		out.println(); //출력 메소드
		
		String str = null; //입력받은 문자열
		
		try {
			while( (str=in.readLine()) != null ) {
				out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.close(); //스트림 닫기, PrintWriter는 try-catch 안해도 됨
		}
		
		
		
		
		
	}
}
