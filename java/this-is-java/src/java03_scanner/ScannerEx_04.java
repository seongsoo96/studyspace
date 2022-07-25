package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//문자열 입력 처리 메소드(기능)
		//	nextLine(), next()
		
		//-------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//문자열 입력 받기
		str1 = sc.nextLine();
		str2 = sc.nextLine();
//		str1 = sc.next();
//		str2 = sc.next();
		
		System.out.println("--------출력--------");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//nextLine()
		//	개행문자(엔터값)를 기준으로 입력한 한 줄을 하나의 문자열로 판단
		
		//next()
		//	공백문자를 기준으로 하나의 문자열을 판단
		
		//-------------------------------------------------------
//		
//		System.out.println();
//		
//		System.out.print('\n');
//		
//		//-------------------------------------------------------
//
//		System.out.println("안녕하세요.");
//		
//		System.out.print("안녕하세요.\n");
//		
//		System.out.print("안녕하세요.");
//		System.out.println();
		
	}
	
	
}
