package day04;
// 사용자로부터
// 번호 이름 국어 영어 수학 점수를 차례대로 입력받고
// 번호: 001번 이름: 조재영
// 국어: 070점 영어: 070점 수학: 071점
// 총점: 211점 평균: 70.33점
// 의 형태로 출력되는 프로그램을 작성하시오.
// 단 사용자가 올바르지 않은 형태의 점수를 입력할 시에는
// "잘못 입력하셨습니다. 다시 입력해주세요"
// "국어: "
// 가 출력되면서 올바른 점수가 입력될때까지
// 다시 입력 받는 프로그램으로 작성하시오(30분까지)
import java.util.Scanner;

public class Ex03GradeBook01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int SUBJECT_SIZE = 3;
		
		System.out.print("번호: ");
		int id = scanner.nextInt();
		
		System.out.print("이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		while(korean < 0 || korean > 100) {
			System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
			System.out.print("국어: ");
			korean = scanner.nextInt();
		}
		
		System.out.print("영어: ");
		int english = scanner.nextInt();
		while(english < 0 || english > 100) {
			System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
			System.out.print("영어: ");
			english = scanner.nextInt();
		}
		
		System.out.print("수학: ");
		int math = scanner.nextInt();
		while(math < 0 || math > 100) {
			System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
			System.out.print("수학: ");
			math = scanner.nextInt();
		}
		
		System.out.printf("번호: %03d번 이름: %s\n", id, name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
				korean, english, math);
		int sum = korean + english + math;
		double average = sum / (double)SUBJECT_SIZE;
		System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
		
		
		scanner.close();
	}
}














