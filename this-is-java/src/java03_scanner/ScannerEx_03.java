package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		//Scanner를 이용한 char 입력
		//	Scanner에는 char를 입력받는 기능이 없다.
		
		//	String은 char형을 여러 개 모아놓는 타입이다.
		//	String으로 입력받고 그 중에서 한 글자(문자)를 떼어낸다 -> char
		
		//-------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.print("문자역 입력 : ");
		String str = sc.nextLine(); //문자열을 입력받아 str객체에 저장
		
		//입력한 문자열 확인 테스트
//		System.out.println("[TEST] str: " + str);
		
		//str문자열의 0번째 인덱스 문자를 ch 변수에 저장
		char ch = str.charAt(0);
		
		//추출한 단일 문자 확인 테스트
		System.out.println("[TEST] ch : " + ch);
		
		//-------------------------------------------------------
		
		System.out.println("-----------");
		System.out.print("성별 입력 : ");
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
		
		System.out.println("입력한 성별 : " + gender);
		
//		char gender = sc.nextLine().charAt(0); //이렇게 한번에 적어도 됨.
	}
}
