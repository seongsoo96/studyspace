package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
//	 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
//
//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
//
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num1 = sc.nextInt();
		
		if(num1<0) {
			System.out.println("음수입니다");
		} else if(num1==0) {
			System.out.println("0입니다");
		} else {
			System.out.println("양수입니다");
		}
		
		System.out.println("----------------------");
		
		System.out.print("Input Number: ");
		int num2 = sc.nextInt();
		
		if(num2%3==0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		System.out.println("----------------------");
		
		System.out.print("Input Number1: ");
		int num3 = sc.nextInt();
		
		System.out.print("Input Number2: ");
		int num4 = sc.nextInt();
		
		if(num3>num4) {
			System.out.println(num3 + "이(가) 더 큰 수");
		} else if (num3<num4) {
			System.out.println(num4 + "이(가) 더 큰 수");
		} else {
			System.out.println("두 수가 같다");
		}
		
		
	}
}
