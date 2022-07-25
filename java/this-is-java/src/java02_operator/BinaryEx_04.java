package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		
		//이항연산자 - 논리
		//  &&  ||   !
		// AND  OR  NOT
		
		// 논리형 타입(boolean) 데이터의 관계를 따져서 결과를 내보내는 연산자
		
		// AND 연산은 피연산자 모두 true일 때 결과가 true
		// OR 연산은 피연산자 중 하나라도 true일 때 결과가 true
		// NOT 연산은 피연산자를 부정(반대로 바꿈)
		
		//-------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2)); //false
		System.out.println("true||false : " + (b1||b2)); //true
		//-------------------------------------------------
		System.out.println("-------------");
		
		int num = 88;
		System.out.println( num >= 1); //true
		System.out.println( num <= 100); //true
		
		System.out.println( num >=1 && num <= 100 ); //true
//		System.out.println( 88 >=1 && 88 <= 100 ); //변수값 활용
//		System.out.println( true && 88 <= 100 ); //88>=1 연산 수행
//		System.out.println( true && true ); //88<=100 연산 수행
//		System.out.println( true ); //true && true 연산 수행
		// -> num변수가 1보다 크거나 같고 100보다 작거나 같은 숫자인가
		// -> num의 값이 1~100 사이의 정수인가
		
		//----------------------------------------------
		
//		System.out.println( 1 <= num <= 100);
//		System.out.println( 1 <= 88 <= 100); //num변수값 활용
//		System.out.println( true <= 100); //1 <= 88 연산 수행
		//	-> true(boolean) 과 100(int) 를 <= 비교연산하게 된다.
		
		//----------------------------------------------
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		//----------------------------------------------
		System.out.println("----------------");
		System.out.println( !( (num >=1) && (num <=100) ) ); // 1~100사이의 정수가 아닌
		System.out.println( num<1 || num >100); // 1보다 작거나 100보다 큰
		
		
	}
}















