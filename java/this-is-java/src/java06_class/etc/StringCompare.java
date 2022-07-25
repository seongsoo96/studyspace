package java06_class.etc;

public class StringCompare {
	public static void main(String[] args) {
		
		
		//문자열 비교
		
		String str1 = "Apple";
		
		if( str1 == "Apple") {
			System.out.println("사과");
		} else {
			System.out.println("X");
		}
		
		//--------------------------------
		
		//객체생성(인스턴스)
		String str2 = new String("Banana");
//		System.out.println("[TEST] str2 : " + str2);
		
		if( str2 == "Banana" ) {
			System.out.println("바나나");
		} else {
			System.out.println("X");
		}
		
		//--------------------------------
		
		//** 문자열을 비교할 때에는 == 연산자를 사용하면 안된다
		
		//--------------------------------
		
		//** 문자열을 비교할 때 equals() 메소드를 이용해야 한다
		//	equals()는 두 문자열이 같으면 true, 다르면 false 반환
		
		//	문자열.equals(문자열)
		if( str2.equals("Banana") ) { }
		
		if( "Banana".equals(str2) ) {
			System.out.println("바나나");
		} else {
			System.out.println("X");
		}
		
	}
}
