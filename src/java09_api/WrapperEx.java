package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		int i1 = 10; //int타입변수 (기본형)
		
		//Integer타입 (참조형)
		Integer iVal1 = new Integer( 20 ); //박싱, Boxing
		Integer iVal2 = new Integer( i1 ); //박싱, Boxing
		
		Integer iVal3 = new Integer( "30" );
		
		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);

		System.out.println("--------------");
		
		int i2 = iVal2.intValue(); //언박싱 Unboxing
		
		//오토 박싱, Auto Boxing
		Integer iVal4 = 1234;
		Double dVal1 = 543.5475;
		
		System.out.println("--------------");
		
		//오토 언박싱, Auto Unboxing
		int i4 = iVal4;
		double d1 = dVal1;
		
		System.out.println("--------------");
		
		//자료형에 대한 정보
		System.out.println("BYTES : " + Integer.BYTES); //4B
		System.out.println("SIZE : " + Integer.SIZE);	//32bit
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);	//최소값
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);	//최대값
		
		System.out.println("--------------");
		
		//문자열 파싱
		//	**parse - 추출하다
		
		//	문자열에서 원하는 형식의 데이터를 추출하는 것
		
		int num1 = Integer.parseInt("1234");
		System.out.println( num1 );
		
		//java.lang.NumberFormatException 발생
		//	파싱하려는 문자열이 숫자형식(NumberFormat)이 아닐 때 발생
//		int num2 = Integer.parseInt("123ABC"); //에러
		
		double d = Double.parseDouble("3.14");
		System.out.println( d );
		
		//---------------------------------------
		
		//parseBoolean은 "true"를 파싱하고 그렇지 않으면 모두 false
		
		System.out.println( Boolean.parseBoolean("true") );	//true
		System.out.println( Boolean.parseBoolean("false") );//false	
		
		System.out.println( Boolean.parseBoolean("123") );	//false
		System.out.println( Boolean.parseBoolean("abc") );	//false
		
		
		
		
		
		
		
		
		
	}
}
