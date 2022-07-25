package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_02 {
//		+ 세 수를 입력 받아 가장 큰 수를 출력하시오
//
//		 + 두 수를 입력 받아 합이 짝수이고
//		  3의 배수인지 판별하시오
//
//		 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//		  평균이 90이상이면 "A", 80이상이면 "B",
//		  70 이상이면 "C", 60 이상이면 "D",
//		  60미만이면 "F" 를 출력하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Input Number1:");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2:");
//		int num2 = sc.nextInt();
//		System.out.print("Input Number3:");
//		int num3 = sc.nextInt();
//		
////		//내 풀이
////		if (num1>=num2 && num1>=num3) {
////			System.out.println(num1 + "이(가) 가장 큰 수");
////		} else if (num2>=num1 && num2>=num3) {
////			System.out.println(num2 + "이(가) 가장 큰 수");
////		} else if (num3>=num1 && num3>=num2){
////			System.out.println(num3 + "이(가) 가장 큰 수");
////		}
////-----------------------------------------------------
//		//강사님 풀이 (엄청 간단하다. 복습할 것)
//		int max = 0; //가장 큰 값 저장할 변수
//		
//		//num1과 num2 중에서 큰 값을 max에 저장하기
//		if(num1>=num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		//max보다 num3가 클 경우에만 max에 num3를 저장하기
//		if(num3>max) {
//			max = num3;
//		}
//		
//		System.out.println("세 숫자 중에서 가장 큰 수: " + max);
		
		
		
		//----------------------------------------------------
		
		
		
//
//		System.out.print("Input Number1: ");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2: ");
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2; //합계
//		
//		if (sum%2==0 && sum%3==0) { //즉 6의 배수를 구하라는 문제.
//			System.out.println("합이 짝수이고 3의 배수입니다."); 
//		} else {
//			System.out.println("3의 배수가 아니거나 짝수가 않습니다.");
//		}
//		
		
		
		
		//---------------------------------------------------
		
		
		
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/(double)3;
		
		System.out.println("합계: " + total);
		
		if(total>300 || total<0) {
			System.out.println("점수 오류");
		} else {
			System.out.println("평균: " + avg);			
			System.out.print("등급: ");
			if(avg>=90) {
				System.out.println("A");
			} else if (avg>=80) {
				System.out.println("B");
			} else if (avg>=70) {
				System.out.println("C");
			} else if (avg>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}			
		}




		
	}
}













