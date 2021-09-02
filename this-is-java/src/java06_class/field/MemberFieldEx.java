package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;

//		System.out.println(m01.num); //private
		
		System.out.println( mf02.getNum() );
		
		mf02.setNum(777);
		System.out.println( mf02.getNum() );
		
		//-----------------------------------------
		
//		System.out.println( mf03.getNum() ); //에러 발생
		
		//NullPointerException 발생
		//	null 참조값을 이용해 멤버에 접근할 때 발생한다
		
		// -> 엄청 자주 보이는 예외!! - 꼭 기억할 것
		
		System.out.println();
		System.out.println("----- 클래스변수 테스트 -----");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		System.out.println( mf04.city );
		System.out.println( mf05.city );
		
		mf04.city = "Busan";
		
		System.out.println("--- Busan 대입 ---");
		System.out.println( mf04.city );
		System.out.println( mf05.city );
		
		//객체가 아닌 클래스명을 통해 접근하는게 좋다
		MemberField_02.city = "Incheon";
		System.out.println(MemberField_02.city);
		
		
		
		
		
	}
}
















