package day04;

import java.util.Scanner;

public class Student {
	// 필드
	private int id;
	private String name;
	private int korean;
	private int english;
	private int math;

	// 메소드
	// 1. 학생의 총점을 계산하는 메소드
	public int calculateSum() {
		int sum = korean + english + math;
		return sum;
	}

	// 2. 학생의 평균을 계산하는 메소드
	public double calculateAverage() {
		double average = calculateSum() / 3.0;
		return average;
	}

	// 3. 생성자
	public Student() {
		id = -1;
		name = "아직 입력 안됨";
		korean = -1;
		english = -1;
		math = -1;
	}

	public Student(int id, String name, int korean, int english, int math) {
		this.id = id;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public String toString() {
		return "번호: " + id + "번" + ", 이름: " + name + ", 국어: " + korean + "점" + ", 영어: " + english + "점" + ", 수학: "
				+ math + "점";

	}

	public boolean equals(Object o) {
		// equals()메소드에 파라미터가 Object 타입이므로
		// 다형성이라는 성질 때문에 모든 클래스의 객체가 파라미터로 들어올 수 있다.
		// 다만 파라미터로 넘어온 객체가 같은 클래스 객체일 때에만
		// 필드 비교에 들어가고 그 외는 아무것도 하지 않는다.
		// 해당 객체가 어떤 클래스의 객체가 맞는지는
		// instanceOf 라는 키워드가 확인해준다.
		if (o instanceof Student) {
			// 비교를 위해서 임시로 쓸
			// Student 객체를 만들고
			// 해당 객체의 초기화는
			// o로 하되, o는 Object 클래스 객체이므로
			// 명시적 형변환을 해서
			// Student 객체를 초기화해준다.
			Student s = (Student) o;
			// 형변환한 o로 초기화된
			// s와 이 메소드를 실행하는
			// 객체의 필드 값들을 비교해준다.
			// 모든 필드를 다 비교해주어도 되고
			// 아니면 중요한 필드들만 비교해주어도 된다.
			// 지금은 학번과 이름만 비교하여
			// 2개가 일치하면 같은 객체인걸로
			// 간주해주자
			if (id == s.id && name.equals(s.name)) {
				return true;
			}
		}

		return false;
	}
	
	// 캡슐화를 위한 getter/setter메소드
	//setter
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	//getter
	public int getId() {
		return id;
	}
	
	public String getName() {
		if(name == null) {			
			return new String();
		}
		return name;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public int getMath() {
		return math;
	}
	
	// 점수가 유효한지 체크하고 유효하면 점수를 return
	// 유효하지 않으면 while에 들어가서 유효한 점수가 들어올 때까지
	// 입력을 받는 메소드
	public int validateScore(Scanner scanner, String message) {
		System.out.print(message);
		int score = scanner.nextInt();
		while(score < 0 || score > 100) {
			System.out.println("잘못입력하셨습니다.");
			System.out.print(message);
			score = scanner.nextInt();
		}
		
		
		return score;
	}
}
