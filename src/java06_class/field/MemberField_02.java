package java06_class.field;

public class MemberField_02 {
	
	private int num; //멤버 필드 -> 인스턴스 변수
	
	//멤버 필드, 클랙스 변수, 정적 변수, static 변수
//	private static String city = "Seoul";
	public static String city = "Seoul";
	
	//------------------------------------------------------
	
	private int data1 =100;; //인스턴스 변수
	
	//정적 멤버 메소드
	public static void test() {
//		System.out.println( data1 ); //에러
	}
	
	//정적메소드에서 인스턴스 변수 사용 불가
	// -> 인스턴스 변수가 공간을 생성하기 전에 실행준비가 완료되어야한다
	
	//------------------------------------------------------
	
	private static int data2; //정적 변수
	
	public static void setData2(int data2) {
		MemberField_02.data2 = data2;
	}
	
	public static int getData2() {
		return data2;
	}
	
	//정적메소드에서는 정적멤버필드만 사용할 수 있다
	
	//------------------------------------------------------
	
	private static int data3; //정적 변수
	
	public void test2() { //일반 멤버메소드
		System.out.println( data3 );
	}
	
	//일반 메소드에서 정적변수를 사용하는 것은 문제가 없다
	
	
	
	
}
