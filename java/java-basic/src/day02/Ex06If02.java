package day02;
// 사용자로부터 숫자를 입력받아서
// 해당숫자가 짝수면 메시지를 출력하세요
// 예시:
// 정수: 6
// 6은 짝수입니다.
// 프로그램 종료

// 정수: 5
// 프로그램 종료

import java.util.Scanner;
public class Ex06If02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수: ");
		int number = scanner.nextInt();
		
		if(number%2==0) {
			System.out.println(number + "은 짝수입니다.");
		}
		System.out.println("프로그램 종료");
		
		scanner.close();

	}

}
