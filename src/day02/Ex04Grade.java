package day02;
// 사용자로부터
// 번호 -> 이름 -> 국어 -> 영어 -> 수학 점수 순으로 입력 받고
// 번호: 001번 이름: 이성수
// 국어: 080점 영어: 078점 수학: 079점
// 총점 237점 평균: 79.00점
// 의 형식으로 출력되게 프로그램을 작성하시오. (쉬는시간 포함해서 12시 10분까지)
import java.util.Scanner;
public class Ex04Grade {

	public static void main(String[] args) {
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("번호: ");
		int number = scanner.nextInt();
		
		System.out.print("이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		
		System.out.print("영어: ");
		int english = scanner.nextInt();
		
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		// 총점을 저장할 int 변수
		int sum = korean + english + math;
		
		// 평균을 저장할 double 변수
		double average = sum / (double)SUBJECT_SIZE;
		
		System.out.printf("번호: %03d번 이름: %s\n", number, name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
		System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
		
		scanner.close();
	}	
}		
		
		// 내가 시도한 것
//		Scanner scanner = new Scanner(System.in);
//		int number;
//		number = scanner.nextInt();
//		System.out.printf("번호: %03d\n", number);
//		
//		scanner.nextLine();
//		String name = scanner.nextLine();
//		System.out.print("이름: " +name);
//
//		number = scanner.nextInt();
//		System.out.printf("국어: %03d\n ", number);
//		number = scanner.nextInt();
//		System.out.print("영어: " + number + "점");
//		number = scanner.nextInt();
//		System.out.print("수학: " + number + "점");
//		number = scanner.nextInt();
//		System.out.println("총점 " + number + "점");
		
