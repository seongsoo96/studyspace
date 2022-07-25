package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//학생 정보 관리 프로그램
		//	이름, 나이, 성별, 국어, 영어, 수학
		//	6가지 정보를 저장할 수 있는 변수를 만들고
		//	총점과 평균을 포함한 결과를 출력한다
		
	//동작 예시)
	//Input Name : Alice
	//Input Age : 33
	//Input Gender : F
	//Input Korean : 100
	//Input English : 99
	//Input Mathematics : 97

	//===== 출력 =====
	//이름	나이	성별	국어	영어	수학	총점	평균
	//Alice	33		F		100		99		97		296		98.666666667
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SUBJECT = 3; //총 과목 수 (상수)
//		String name;
//		int age;
//		String gender;
//		int korean;
//		int eng;
//		int math;
		
		//이름 입력
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		//나이 입력
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		//성별 입력 ( M/F )
		System.out.print("성별(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("영어: ");
		int eng = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = korean + eng + math;
//		System.out.println("총점: " + sum);
		
		double avg = sum/(double)SUBJECT;
		
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t" 
				+ age + "\t" 
				+ gender + "\t" 
				+ korean + "\t"
				+ eng + "\t"
				+ math + "\t"
				+ sum + "\t");
//		System.out.println(avg); //평균
		System.out.printf("%.2f", avg); //avg값을 소수점 둘째자리까지만 출력함. 
	}
}
