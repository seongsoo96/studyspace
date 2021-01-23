package java06_class.uml.manage.ver2;

import java.util.Scanner;

public class StudentService_ver2 {
	private Scanner sc = new Scanner(System.in);
	private Student[] stuArr = new Student[3];
	
	
	
	//생성자
	public StudentService_ver2() {
		
	}
	
	//메소드
	private int getIdx() {
		int idx;
		do {
			System.out.print("몇번째학생? ");
			idx = sc.nextInt();
			if(idx<1 || idx>3)
				System.out.println(" >> Error : 3명만 존재합니다");
		} while(idx<1 || idx>3);
		
		return idx-1;
	}
	
	private void insertInfo(Student who, int idx) {
		
		int num = idx;
		
		stuArr[num] = new Student();
		
		sc.nextLine();
		System.out.print("이름 >> ");
		stuArr[num].setName(sc.nextLine());
		System.out.print("나이 >> ");
		stuArr[num].setAge(sc.nextInt());
		sc.nextLine();
		

	}
	
	public void insertInfoAll() {
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
			
			System.out.print("이름 >> ");
			stuArr[i].setName(sc.nextLine());
			System.out.print("나이 >> ");
			stuArr[i].setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.println();
			System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
			System.out.print(stuArr[i].getName() + "\t");
			System.out.print(stuArr[i].getAge() + "\t");
			System.out.print(stuArr[i].getKor() + "\t");
			System.out.print(stuArr[i].getEng() + "\t");
			System.out.print(stuArr[i].getMath() + "\t");
			System.out.print(stuArr[i].getSum() + "\t");
			System.out.print(stuArr[i].getAvg() + "\t");
			System.out.println();
			System.out.println();

		}
	}
	
	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr[idx], idx);
	}
	
	//-------------------------------------------------
	private void insertScore(Student who, int idx ) {
		int num = idx;
		
		System.out.println("- - - " + (num+1) + "번째 학생 점수 입력 - - -");
		System.out.print("국어 >> ");
		stuArr[num].setKor(sc.nextInt());
		System.out.print("영어 >> ");
		stuArr[num].setEng(sc.nextInt());
		System.out.print("수학 >> ");
		stuArr[num].setMath(sc.nextInt());
		
		calcSum(stuArr[num]);
		calcAvg(stuArr[num]);
	}
	
	public void insertScoreAll() {
		for(int i=0; i<stuArr.length; i++) {
			
			System.out.println("- - - " + (i+1) + "번째 학생 점수 입력 - - -");
			System.out.print("국어 >> ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print("영어 >> ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print("수학 >> ");
			stuArr[i].setMath(sc.nextInt());
			
			calcSum(stuArr[i]);
			calcAvg(stuArr[i]);
			
		}
	}
	
	public void insertScoreIdx() {
		int idx = getIdx();
		this.insertScore(stuArr[idx], idx);
	}
	
	//-------------------------------------------------
	
	public void insertStu(int idx) {
		
		int num = getIdx();
		
		
		stuArr[num] = new Student();
		System.out.println("- - - " + (num+1) + "번째 학생 정보 입력 - - -");
		
		System.out.print("이름 >> ");
		stuArr[num].setName(sc.nextLine());
		System.out.print("나이 >> ");
		stuArr[num].setAge(sc.nextInt());
		
		System.out.println("- - - " + (num+1) + "번째 학생 점수 입력 - - -");
		
		System.out.print("국어 >> ");
		stuArr[num].setKor(sc.nextInt());
		System.out.print("영어 >> ");
		stuArr[num].setEng(sc.nextInt());
		System.out.print("수학 >> ");
		stuArr[num].setMath(sc.nextInt());
		
		calcSum(stuArr[num]);
		calcAvg(stuArr[num]);
	}
	
	public void insertStuAll() {
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
			
			System.out.println("- - - " + (i+1) + "번째 학생 정보 입력 - - -");
			
			System.out.print("이름 >> ");
			stuArr[i].setName(sc.nextLine());
			System.out.print("나이 >> ");
			stuArr[i].setAge(sc.nextInt());
			
			System.out.println("- - - " + (i+1) + "번째 학생 점수 입력 - - -");
			
			System.out.print("국어 >> ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print("영어 >> ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print("수학 >> ");
			stuArr[i].setMath(sc.nextInt());
			sc.nextLine();
		}
		for(int i=0; i<stuArr.length; i++) {
			calcSum(stuArr[i]);
			calcAvg(stuArr[i]);
		}
	}
	
	//-------------------------------------------------
	
	private void calcSum(Student who) {
		
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i].setSum(stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath());
		}
	}
	
	private void calcAvg(Student who) {
		for(int i=0; i<3; i++) {
			stuArr[i].setAvg(stuArr[i].getSum()/(double)3);
		}
	}
	
	//-------------------------------------------------
	
	private void printStu(Student strArr, int idx) {
		
		int num = idx;
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.print(stuArr[num].getName() + "\t");
		System.out.print(stuArr[num].getAge() + "\t");
		System.out.print(stuArr[num].getKor() + "\t");
		System.out.print(stuArr[num].getEng() + "\t");
		System.out.print(stuArr[num].getMath() + "\t");
		System.out.print(stuArr[num].getSum() + "\t");
		System.out.print(stuArr[num].getAvg() + "\t");
		System.out.println();
	}
	
	public void printStuAll() {
		
		try {
			for(int i=0; i<stuArr.length; i++) {
				
				System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
				System.out.print(stuArr[i].getName() + "\t");
				System.out.print(stuArr[i].getAge() + "\t");
				System.out.print(stuArr[i].getKor() + "\t");
				System.out.print(stuArr[i].getEng() + "\t");
				System.out.print(stuArr[i].getMath() + "\t");
				System.out.print(stuArr[i].getSum() + "\t");
				System.out.print(stuArr[i].getAvg() + "\t");
				System.out.println();
			}
		} catch(NullPointerException e){
			for(int i=0; i<stuArr.length; i++) {
				stuArr[i] = new Student();
				
				System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
				System.out.print(stuArr[i].getName() + "\t");
				System.out.print(stuArr[i].getAge() + "\t");
				System.out.print(stuArr[i].getKor() + "\t");
				System.out.print(stuArr[i].getEng() + "\t");
				System.out.print(stuArr[i].getMath() + "\t");
				System.out.print(stuArr[i].getSum() + "\t");
				System.out.print(stuArr[i].getAvg() + "\t");
				System.out.println();
			}
		}
		
		
	}
	
	public void printStuIdx() {
		int idx = getIdx();
		printStu(stuArr[idx], idx);
	}
	
}
















