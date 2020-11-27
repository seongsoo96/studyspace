package day05;
// 무한루프 메뉴가 들어간

// 학생정보 입력 프로그램을 작성하시오.
// (30분까지)
// 단 사용자가 아무런 정보가 없이 출력을 눌렀을 경우
// "아무런 정보도 입력되지 않았습니다" 가 나오게 작성하시오

import day04.Student;
import java.util.Scanner;

public class Ex01Student01 {
	public static void main(
			String[] args) {
		Scanner scanner = new Scanner(
				System.in);
		Student s = new Student();
		while (true) {
			System.out.println(
					"1. 입력 2. 출력 3. 종료");
			int userChoice = scanner
					.nextInt();
			if (userChoice == 1) {
				// 학생 정보 입력 코드 실행
				System.out.print("번호: ");
				s.setId(scanner.nextInt());
				
				scanner.nextLine();
				System.out.print("이름: ");
				s.setName(scanner.nextLine());
				
				s.setKorean(s.validateScore(scanner, "국어: "));
				
				s.setEnglish(s.validateScore(scanner, "영어: "));
				
				s.setMath(s.validateScore(scanner, "수학: "));
				
				
			} else if (userChoice == 2) {
				// 학생 정보 출력 코드 실행
				if (s.calculateSum() < 0) {
					System.out.println(
							"아직 입력된 정보가 없습니다.");
				} else {
					System.out.printf(
							"번호: %03d번 이름: %s\n",
							s.getId(),
							s.getName());
					System.out.printf(
							"국어: %03d점 영어: %03d점 수학: %03d점\n",
							s.getKorean(),
							s.getEnglish(),
							s.getMath());
					System.out.printf(
							"총점: %03d점 평균: %.2f점\n",
							s.calculateSum(),
							s.calculateAverage());
				}
			} else if (userChoice == 3) {
				System.out.println(
						"사용해주셔서 감사합니다.");
				break;
			}
		}

		scanner.close();
	}
}
