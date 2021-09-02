package java08_abstract;

abstract class  Person { //부모클래스
	protected String name; //이름
	
	public Person(String name) {
		this.name = name;
	}
	
	//추상메소드
	public abstract void display(); //객체의 정보를 출력하는 기능
}

class Professor extends Person { //자식클래스
	private String major; //전공
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major + "전공");
		
	}
}

class Student extends Person { //자식클래스
	private String subject; //수강과목
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + "수강");		
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
	}
}
