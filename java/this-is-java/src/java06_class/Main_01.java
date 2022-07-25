package java06_class;

//모든 클래스는 데이터타입으로 생각하면 된다
//클래스 == 참조형 데이터타입

//객체 변수는 참조형이다

//실행 클래스 - 메인 메소드가 정의되어있는 클래스
public class Main_01 {
	public static void main(String[] args) {
		
		// Class_01 타입의 변수 c01 선언
		Class_01 c01; //객체 변수
		
		// Class_01 타입의 인스턴스 생성하고 c01 변수에 저장(대입)
		c01 = new Class_01(); //인스턴스화, 객체 생성
		
		//멤버필드에 값 대입하기
		c01.num = 100;
		c01.data = "Apple";
		
		//c01객체의 멤버필드 num, data 출력하기
		System.out.println( c01.num );
		System.out.println( c01.data );
		
		//-------------------------------------------
		System.out.println("-----------------");
		
		//객체 변수 출력 - 레퍼런스(참조값)가 기본으로 출력된다
		System.out.println(c01);
		
		//-------------------------------------------
		System.out.println("-----------------");
		
		//c01객체변수의 멤버 메소드 사용하기(호출, call)
		//	메소드명을 적고 ()괄호를 붙인다
		c01.display();
		
		//-------------------------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		
		
		
		
		
	}
}
