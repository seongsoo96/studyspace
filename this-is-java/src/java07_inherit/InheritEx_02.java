package java07_inherit;

class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
	
}

class Child2 extends Parent2 {
//	public int num;
	private int num;
	
	@Override
	public void display() {
		num = 111;
		System.out.println("오버라이딩 메소드");
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
//		c.num = 555;
		c.display();
		
		System.out.println("--------------");
		
		Parent2 p = new Parent2();
		p.num = 888;
		p.display();
		
		System.out.println("--------------");
		
		// Parent2 <- Child2 형변환
		Parent2 pc = new Child2();
		
		pc.display();
		
		System.out.println("--------------");
		
		//java.util.ClassCastException 에러 발생
//		Child2 cp = (Child2) new Parent2();
		
		//자식클래스 타입을 부모클래스 타입으로 형변환 가능
		//부모클래스 타입을 자식클래스 타입으로 형변환 불가능
		//	-> ClassCastException
		
	}
}
