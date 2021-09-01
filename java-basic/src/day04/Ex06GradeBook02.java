package day04;
// 성적 관리 프로그램을 만드시오

// 조건 1: 사용자가 잘못된 입력을 하면 올바른 점수가 들어올때까지 다시 입력하게
//        작성하시오
// 조건 2: 메뉴를 만들어서 사용자가 입력을 선택하면 점수를 입력하고
//        출력을 누르면 기존의 정보를 토대로하여 점수를 출력할수 있도록 
//        작성하시오
// 도전과제: 만약 사용자가 아무런 입력없이 출력을 선택하면
//         아무런 정보도 입력되지 않았습니다가 출력되게 작성하시오
// (45분까지)

// 고려해볼점: 변수의 선언위치
import java.util.Scanner;

public class Ex06GradeBook02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int SUBJECT_SIZE = 3;

		// 학생의 정보를 담을 변수의 위치는 어디가 되어야 할까?
		// 정답은 while 루프 이전이 된다.

		int id = 0;
		String name = new String();
		int korean = -1;
		int english = -1;
		int math = -1;

		boolean dataSwitch = false;

		while (true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			int userChoice = scanner.nextInt();
			if (userChoice == 1) {
				// 입력하는 코드를 적어준다.
				System.out.print("번호: ");
				id = scanner.nextInt();

				System.out.print("이름: ");
				scanner.nextLine();
				name = scanner.nextLine();

				System.out.print("국어: ");
				korean = scanner.nextInt();
				while (korean < 0 || korean > 100) {
					System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
					System.out.print("국어: ");
					korean = scanner.nextInt();
				}

				System.out.print("영어: ");
				english = scanner.nextInt();
				while (english < 0 || english > 100) {
					System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
					System.out.print("영어: ");
					english = scanner.nextInt();
				}

				System.out.print("수학: ");
				math = scanner.nextInt();
				while (math < 0 || math > 100) {
					System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
					System.out.print("수학: ");
					math = scanner.nextInt();
				}

				dataSwitch = true;

			} else if (userChoice == 2) {
				// 만약 사용자가 아무런 값도 입력하지 않고 출력을 할려고 하면
				// "아직 입력된 내용이 없습니다." 라고
				// 출력을 해주고 싶다면
				// 2가지 방법으로 처리가 가능하다.

				// 1. boolean 변수를 만들어서 입력을 했을때
				// true로 바꿔서 체크하는 방법

				if (dataSwitch) {
					// 출력하는 코드를 적어준다.
					System.out.printf("번호: %03d번 이름: %s\n", id, name);
					System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
					int sum = korean + english + math;
					double average = sum / (double) SUBJECT_SIZE;
					System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);

				} else {
					System.out.println("아직 입력된 정보가 없습니다.");
				}

				// 2. 국어 영어 수학 점수의 초기화값을 불가능한 점수로
				// 초기화 하는 방법
				if(name.isEmpty()) {
					System.out.println("아직 입력된 정보가 없습니다.");
				}

			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}

		scanner.close();
	}
}
