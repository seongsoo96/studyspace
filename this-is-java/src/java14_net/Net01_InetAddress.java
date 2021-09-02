package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		//InetAddress 클래스
		//	IP정보 관리 클래스
		
		//	생성자 없음, 직접 객체 생성 불가능
		//	도메인주소를 이용해서 얻어와서 사용한다
		
		//-------------------------------------------
		
		InetAddress ip = null; //IP주소 표현 객체
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(ip);
		
		//호스트 이름
		System.out.println( ip.getHostName() );
		
		//호스트 IP
		System.out.println( ip.getHostAddress() );
		
		System.out.println("-----------------------");
		
		//로컬 호스트, Localhost
		//	자기 자신을 지칭하는 용어
		
		//	가상 루프백(loopback) 호스트
		
		//	루프백 호스트 네임 : localhost
		//	루프백 호스트 IP : 127.0.0.1
		
		
		
		
		
		
		
		
	}
}
