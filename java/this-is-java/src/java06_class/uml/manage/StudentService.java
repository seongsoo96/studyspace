package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu = new Student(); //학생 정보 객체
	private Scanner input = new Scanner(System.in); //표준 입력 객체
	
	public StudentService() {
	}
	
	//이름과 나이 입력(인적사항 입력)
	public void insertInfo() {
		System.out.print("이름 >> " );
		stu.setName(input.nextLine());
		
		System.out.print("나이 >> ");
		stu.setAge(input.nextInt());
	}
	
	//국영수 점수 입력(점수 입력)
	public void insertScore() {
		System.out.print("국어 >> ");
		stu.setKor(input.nextInt());
		
		System.out.print("영어 >> ");
		stu.setEng(input.nextInt());
		
		System.out.print("수학 >> ");
		stu.setMath(input.nextInt());
		
		this.calcSum(); //총점 계산하기
		this.calcAvg(); //평균 계산하기
	}
	
	//합계 계산
	private void calcSum() {
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
	}
	
	//평균 계산
	private void calcAvg() {
		stu.setAvg( stu.getSum()/(double)3 );
	}
	
	//학생 정보 출력
	public void printStu() {
		System.out.println();
		System.out.println(" - - - 학생 정보 - - -");
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");
		System.out.print(stu.getSum() + "\t");
		System.out.printf("%.2f", stu.getAvg());
		
		//서식문자 "%.2f"
		//	실수형 데이터를 소수점이하 둘째자리까지 표현한다
		
	}
}
