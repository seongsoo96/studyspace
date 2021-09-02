package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드 입력 객체
		
		System.out.println("---입력---");
		System.out.print("Input Number : ");
		int num = sc.nextInt(); //정수값 입력받기
		
		sc.nextLine(); //입력버퍼 문제 해결 방법
		
		System.out.print("Input String : ");
		String str = sc.nextLine(); //문자열 입력받기
		
		System.out.println("---출력---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
	}
}