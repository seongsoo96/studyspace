package java08_abstract.interfaceEx;

abstract class TestClass { //추상클래스
	int num; //멤버필드, 인스턴스 변수
	
	public void method() { //멤버메소드, 일반메소드
		
	}
	
	public abstract void method1(); //멤버메소드, 추상메소드
	public abstract void method2(); //멤버메소드, 추상메소드
}

interface TestInterface { //인터페이스
	//상수 & 추상메소드만 멤버로 가진다
	
	//----------------------------------------------------------------
	
	//public static final 키워드를 붙인 필드만 생성가능(상수)
	public static final int NUM = 123; //선언과 동시에 초기화 필수!
	
	//public static final 키워드를 생략해도 자동으로 붙여서 생성된다
	int NUM2 = 345;
	public int NUM3 = 567;
	static int NUM4 = 34;
	
	//----------------------------------------------------------------
	
	//인터페이스는 일반메소드를 멤버로 가질 수 없다
//	public void method() {
//	}
	
//	public abstract void out(); //추상메소드
	
	public default void out() { //디폴트메소
		
	}
	
	//abstract 키워드 없이 메소드를 작성해도 추상메소드로 처리된다
	public void display(); //추상메소드
	
}

//----------------------------------------------------------------

class Test extends TestClass {

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}
	
}

//----------------------------------------------------------------

class Test2 implements TestInterface {

	@Override
	public void out() {
		
	}

	@Override
	public void display() {
		
	}
}

//----------------------------------------------------------------

class Test3 extends TestClass implements TestInterface {
	
	//--- TestInterface의 멤버메소드 ---
	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	//--- TestClass의 멤버메소 ---
	@Override
	public void display() {
		
	}
	
}






public class interfaceEx_01 {
	public static void main(String[] args) {
		
		//인터페이스의 상수
		System.out.println( TestInterface.NUM );	
		System.out.println( TestInterface.NUM2 );	
		
		//----------------------------------------
		
		//인터페이스를 상속받은 클래스의 상수
		System.out.println( Test3.NUM );
		System.out.println( Test3.NUM2 );
	}
}
