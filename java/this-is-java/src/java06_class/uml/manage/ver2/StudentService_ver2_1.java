package java06_class.uml.manage.ver2;

import java.util.Scanner;

public class StudentService_ver2_1 {
	
	//--- Field ---
	private Scanner sc = new Scanner(System.in);
	private Student[] stuArr = new Student[3];
	
	
	//--- Constructor ---
	public StudentService_ver2_1() {
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
		}
	}
	
	
	//--- Method ---
	private int getIdx() {
		int idx;
		do {
			System.out.print("몇번째학생? ");
			idx = sc.nextInt();
			if(idx<1 || idx>3)
				System.out.println(" >> Error : 3명만 존재합니다");
		} while(idx<1 || idx>3);
		
		return idx;
	}
	
	private void insertInfo(Student s, int i) {
		
		System.out.print(" ++ " + i + "번째 학생 기본 정보 입력 ++");
		System.out.print("이름 >> ");
		String name = sc.next();
		s.setName(name);
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		s.setAge(age);
		
	}
	
	public void inserInfoAll() {
		for(int i=0; i<stuArr.length; i++) {
			insertInfo(stuArr[i], i+1);
		}
		
	}
	
	public void inserInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr[idx-1], idx);
	}
	
	private void insertScore(Student s, int i) {
		System.out.print(" ++ " + i + "번째 학생 기본 정보 입력 ++");
		System.out.print("국어 >> ");
		s.setKor(sc.nextInt());
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		s.setEng(eng);
		System.out.print("수학 >> ");
		int math = sc.nextInt();
		s.setMath(math);
		
		calcSum(s);
		calcSum(s);
	}
	
	public void insertScoreAll() {
		for(int i=0; i<stuArr.length; i++) {
			insertScore(stuArr[i], i+1);
		}
	}
	
	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr[idx-1], idx);
		
	}
	
	public void insertStu(int idx) {
		
	}
	
	public void insertStuAll() {
		
	}
	
	private void calcSum(Student s) {
		s.setSum(s.getKor() + s.getEng() + s.getMath());
	}
	
	private void calsAvg(Student s) {
		s.setAvg(s.getSum()/(double)3);
	}
	
}
















