package java07_inherit;

class Parent3 {
	protected int num = 111;
	
	public Parent3() {
		System.out.println("부모 디폴트 생성자");
		System.out.println( this.num );
	}
}

class Child3 extends Parent3 {
	private int num = 333;
	
	public Child3() {
		System.out.println("자식 디폴트 생성자");
		
		System.out.println("this.num: " + this.num);
		System.out.println("super.num: " + super.num);
	}
}

public class InheritEx_03 {
	public static void main(String[] args) {
		
		Parent3 p = new Parent3();
		
		System.out.println("------------");
		
		Child3 c = new Child3();
		
		
		
		
		
		
		
	}
}
