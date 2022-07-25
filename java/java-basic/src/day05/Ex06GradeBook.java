package day05;

import java.util.ArrayList;
import java.util.Scanner;

import day04.Student;

public class Ex06GradeBook {
	private final static int SIZE = 5;
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print("> ");
			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				// 학생을 5명 까지만 추가 가능하게 한다.
				if (list.size() < SIZE) {
					// 데이터를 담을 Student 객체 생성
					Student s = new Student();

					System.out.print("번호: ");
					s.setId(scanner.nextInt());

					System.out.print("이름: ");
					scanner.nextLine();
					s.setName(scanner.nextLine());
					
					// 중복된 번호와 이름을 가진 학생을 막는 코드
//					while(list.contains(s)) {
//						System.out.println("이미 존재하는 학생입니다.");
//						System.out.println("새로운 학생을 입력해주세요");
//						
//						System.out.print("번호: ");
//						s.setId(scanner.nextInt());
//
//						System.out.print("이름: ");
//						scanner.nextLine();
//						s.setName(scanner.nextLine());
//					}
					
					// 사용자가 입력한 학생이 존재할 시에는
					// 해당 학생의 국영수 점수를 수정 하는 코드
					
					if(list.contains(s)) {
						//학생 수정 코드 실행
						// 1. 리스트에서 해당 학생의 index를 불러온다.
						int index = list.indexOf(s);
						
						// get(index)를 실행시키고 
						// 거기에 setKorean등의 메소드를 실행시킨다.
						
						list.get(index).setKorean(s.validateScore(scanner, "국어: "));
						list.get(index).setEnglish(s.validateScore(scanner, "영어: "));
						list.get(index).setMath(s.validateScore(scanner, "수학: "));
						
					}else {
						//s에 점수 입력후 list에 추가
						s.setKorean(s.validateScore(scanner, "국어: "));
						s.setEnglish(s.validateScore(scanner, "영어: "));
						s.setMath(s.validateScore(scanner, "수학: "));

						list.add(s);
					}
					

					
				} else {
					System.out.println("최대 학생수에 도달했습니다.");
				}

			} else if (userChoice == 2) {
				// 리스트를 출력하는 코드 실행
				// 단 리스트가 비어있을 경우
				// 아직 추가된 학생이 없다고 경고 메시지만 출력
				if (list.isEmpty()) {
					System.out.println("아직 추가된 학생이 없습니다.");

				} else {
					for (Student s : list) {
						System.out.println("--------------------------");
						System.out.printf("번호: %03d번 이름: %s\n", s.getId(),
								s.getName());
						System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
								s.getKorean(), s.getEnglish(), s.getMath());

						System.out.printf("총점: %03d점 평균: %.2f점\n",
								s.calculateSum(), s.calculateAverage());
						System.out.println("--------------------------");
					}
				}

			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}

		}

		scanner.close();
	}
}
