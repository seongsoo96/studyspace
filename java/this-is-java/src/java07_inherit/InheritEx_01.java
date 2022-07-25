package java07_inherit;

class Parent {
	String name;
	int num;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");
	}
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
		System.out.println("상속받은 메소드를 재정의한 것");
	}
	
	//** 어노테이션, Annotation
	//	코드의 부가적인 의미를 부여할 때 사용한다
	//	특정 동작이나 문법을 코드에 간단히 적용시킬 수 있다
	//	@Override, @Deprecate, @Target, @Controller, @Service, ...
	
	//@Override 어노테이션
	//	오버라이딩 규칙을 잘 지켰는지 유효성검사를 한다
	//	문법을 어겼다면 에러가 발생한다
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.name = "Apple";
		p.num = 123;
		
		//-------------------------------------
		
		Child c = new Child();
		c.name = "Bob"; //상속
		c.num = 456; //상속
		c.score = 777;
		
		//-------------------------------------
		
		p.display();
		
		System.out.println("------------");
		
		c.display(); //상속
		c.print();
		
		
	}
}
