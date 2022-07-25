package java06_class.field;

public class MemberField_03 {

	//--- 멤버 필드---
	private int num1 = 777; //인스턴스 변수
	private static int num2 = 888; //클래스 변수 
	//----------------
	
	//일반 메소드
	public void method(int param) { //param -> 매개 변수, 지역 변수
		
		System.out.println(num1);
		System.out.println(num2);
		
		//---------------------------------
		
		int num1 = 101; //지역 변수
		int num2 = 202; //지역 변수
		
		System.out.println(num1);
		System.out.println(num2);
		
		//---------------------------------
		
		System.out.println( this.num1 ); //멤버 필드
		System.out.println( this.num2 ); //멤버 필드
		
		//정적 멤버필드는 정적인 방법으로 사용하는 것이 좋다
		System.out.println( MemberField_03.num2 ); //정적 멤버 필드
	}
	
}
