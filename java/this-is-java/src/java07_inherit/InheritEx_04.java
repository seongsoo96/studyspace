package java07_inherit;

class Parent4 {
	protected int num;
	
	public Parent4() {
		System.out.println("부모 디폴트 생성자");
	}
	
	public Parent4(int num) {
		this.num = num;
		
		System.out.println("부모 매개변수있는 생성자");
	}
}

class Child4 extends Parent4 {
	public Child4() {
		super(); //수퍼 생성자, 생략되어있음
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child4(int num) {
//		super(); //생략되어있음
		super(num);
		
		super.num = num;
		this.num = num; //Child4필드에 num이 없어서 super역역에서 찾음
		
		System.out.println("자식 매개변수있는 생성자");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		Parent4 p = new Parent4();
		
		System.out.println("------------");
		Child4 c = new Child4();
		
		System.out.println("------------");
		Parent4 p2 = new Parent4(111);
		
		System.out.println("------------");
		Child4 c2 = new Child4(222);
		
		
	}
}
