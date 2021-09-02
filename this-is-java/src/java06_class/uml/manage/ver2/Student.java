package java06_class.uml.manage.ver2;

public class Student {
	
	//--- 인적 정보 ---
	private String name; //이름
	private int age; //나이
	//-----------------------
	
	//--- 점수 ---
	private int kor; //국어 점수
	private int eng; //영어 점수
	private int math; //수학 점수
	
	private int sum; //총점
	private double avg; //평균
	
	//--- getter / setter ---
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
