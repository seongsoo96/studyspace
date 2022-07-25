package java06_class.method.quiz;

import java.util.Scanner;

public class MethodQuizEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MethodQuiz mq = new MethodQuiz();
		
		//Q1. 1~100출력
		mq.print100();
		System.out.println("---------");
	
		
		//Q2. 입력값만큼 Hello 출력
		System.out.print("얼마까지 출력? ");
		int num = sc.nextInt(); 
		
		mq.printHello( num ); 
		System.out.println("---------");
		

		//Q3. 입력한 횟수만큼 입력한 텍스트 출력
		System.out.print("몇번 출력? ");
		int cnt = sc.nextInt();
		
		sc.nextLine(); //버퍼 비우기
		System.out.print("무엇을 출력? ");
		String text = sc.nextLine();
		
		mq.printText(cnt, text);
	}
}
