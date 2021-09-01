package day04;
// 사용자로부터 자연수 입력을 받는 프로그램
// 단 사용자가 음수를 입력하면
// 자연수가 입력될때까지
// "잘못된 입력입니다. 다시 입력해주세요: "
// 라고 출력되게 만들어보자

import java.util.Scanner;
public class Ex02While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		int number = scanner.nextInt();
		
		while(number < 0) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("자연수를 입력하세요: ");
			number = scanner.nextInt();
		}
		
		System.out.println("사용자가 입력한 자연수: "+number);
		
		
		scanner.close();
	}
}






