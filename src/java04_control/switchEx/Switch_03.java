package java04_control.switchEx;

public class Switch_03 {
	public static void main(String[] args) {
		
		//논리형(boolean) 데이터를 switch에 사용할 수 없음
//		boolean b = true;
//		switch( b ) {
//		}
		
		//-------------------------------------------------------
		
		//실수형 데이터를 switch에 사용할 수 없음
//		double dVal = 332.435;
//		switch( dVal ) {
//		}
		
		//------------------------------------------------------
		
		//switch에서 char형 사용하기

		char alpha = 'B';	//정수(코드)로 처리된다

		switch( alpha ) {
			case 'A':
				System.out.println("A에요");
				break;
			case 'B':
				System.out.println("B에요");
				break;
			case 'C':
				System.out.println("C에요");
				break;
			default:
				System.out.println("A, B, C 다 아님");
		}
		
	}
}
