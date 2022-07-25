package day02;
// 사용자로부터 정수를 입력받아서
// 해당 정수가 홀수인지 짝수인지 출력하는 프로그램을 작성하시오

import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("정수: " + number);
		
		if (number%2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		scanner.close();
	}
	
	
}
