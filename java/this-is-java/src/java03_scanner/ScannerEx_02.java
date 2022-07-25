package java03_scanner;

import java.util.Scanner;

//java.lang 패키지의 클래스는 import없이 클래스명으로 사용 가능
//import java.lang.String;

public class ScannerEx_02 {

	public static void main(String[] args) {
		
		//import 최적화 단축키
		//	command + shift + o
		
		//-------------------------------
		
		//문자열 입력받기
		
		//1. 입력객체 변수 선언 (java.util.Scanner)
		Scanner in;
		
		//2. 입력객체 생성 (new)
		in = new Scanner(System.in);
		
		//3. 문자열 입력받기 (String)
		System.out.print("문자열을 입력하세요 : ");
		String str = in.nextLine();
		
		//4. 입력받은 문자열 출력하기
		System.out.println("입력한 내용 : " + str);
		

	}

}
