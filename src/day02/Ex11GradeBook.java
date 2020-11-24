package day02;
// 사용자로부터 점수를 입력받아서
// 90~100: A
// 80~89: B
// 70~79: C
// 60~69: D
// ~59: F
// 가 출력되는 프로그램을 작성하시오

import java.util.Scanner;
public class Ex11GradeBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수: ");
		int score = scanner.nextInt();
		
		System.out.println("1. 값 검증이 되지 않은 버전");
		if(score>=90 ) {
			System.out.println("A");
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println("------------------------");
		
		// 검증(validation)
		// 검증이란 사용자가 입력한 값이
		// 유효한 값인지 체크하는 과정을 검증이라고 한다.
		// 예를 들어서 지금과 같이 점수를
		// 알파벳으로 환산해서 보여주는 프로그램의 경우
		// 점수는 0~100 사이의 숫자여야만 한다.
		// 사용자가 - 점수나 아니면 100을 초과하는 숫자를 입력하면
		// 그에 따른 잘못된 결과가 나오게 된다.
		
		// 값을 검정하는 방법은 다양하게 있지만
		// 우리는 여기서 두가지 방법을 통하여
		// 올바른 값을 입력할 때에만 알파벳 점수가 나오고
		// 그 외는 "잘못된 점수형태입니다." 가 출력되게 if-else if 구조를
		// 만들어볼 것이다.
		
		// 값 검증하는 방법 1번: 조건식의 조건을 정확하게 잡아주자
		System.out.println("값 검증 1번: 정확한 조건식");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >=70 && score <= 79) {
			System.out.println("C");
		} else if(score >=60 && score <= 69) {
			System.out.println("D");
		} else if (score >=0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 점수형태입니다.");
		}
		System.out.println("------------------------");
		
		// 값 검증하는 방법 2번: 값이 먼저 유효한지부터 체크한다.
		// 이때는 구조가 "중첩 if(nested if)" 형태가 된다.
		// 중첩 if문이랑 커다란 if문 안에 또다른 if문이 들어가는 형태이다.
		// 2중, 3중, 4중이 되었던간에 우리가 필요한 만큼 중첩해서 사용가능하다.
		
		System.out.println("값 검증 2번: 먼저 입력값이 유효한지 체크");
		if(score >= 0 && score <= 100) {
			// 사용자가 입력한 점수가 올바른 형태이므로
			// 간단한 if-else if 구조로
			// 알파벳 점수를 보여줄 수 있다.
			if(score>=90 ) {
				System.out.println("A");
			}else if(score >=80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			// 사용자가 입력한 점수가 잘못된 형태이므로
			// 경고메시지 출력
			System.out.println("잘못된 점수형태입니다.");
		}
		System.out.println("---------------------------");
	
		
		scanner.close();

	}

}
