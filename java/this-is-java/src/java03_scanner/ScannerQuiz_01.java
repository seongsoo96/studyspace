package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	public static void main(String[] args) {
		
		//1. 필요한 변수 선언 ( +데이터타입 )
		
		//필요한 데이터 : 밑변, 높이
		int base; //밑변
		int height; //높이
		
		//필요한 객체 : Scanner
		Scanner sc = new Scanner(System.in); //입력 객체
		
		//계산이 완료된 값 : 넓이
		double area; //넓이
		
		//2. 데이터 입력 ( 밑변, 높이 )
		System.out.print("밑변의 길이를 입력하세요 :");
		base = sc.nextInt();
		
		System.out.print("높이의 길이를 입력하세요: ");
		height = sc.nextInt();
		
		//TEST 해보자.
//		System.out.println("[TEST] base: " + base);
//		System.out.println("[TEST] height: " + height);
		
		//3. 문제에 주어진 식 계산 ( 넓이 )
		area = base * height / (double)2;
		
//		System.out.println("[TEST] area: " + area);
		
		//4.  결과 출력
		System.out.println("밑변: " + base
				+ ", 높이: " + height
				+ "인 삼각형의 넓이는 " + area
				+ "입니다.");
		System.out.print("밑변: " + base);
		System.out.print(", 높이: " + height);
		System.out.println("인 삼각형의 넓이는 " + area + "입니다.");
	}
}
