package java06_class;

public class Main_02 {
	public static void main(String[] args) {
		
//		int형 기본값 - 0
//		double형 기본값 - 0.0
//		boolean형 기본값 - false
//		char형 기본값 - '\0' (null문자)
//		
//		참조형 기본값 - null
//		** null : 참조대상이 없음
		
		//---------------------------------------------
		
		Class_02 cl = null; //객체 변수 선언
		
		cl = new Class_02(); //객체 생성, 인스턴스화
		
		//멤버 필드값 출력
		System.out.println( cl.num4 ); //public
		System.out.println( cl.num3 ); //protected
		System.out.println( cl.num2 ); //default
		
//		System.out.println( cl.num1 ); //private 에러
		
		
	}
}
