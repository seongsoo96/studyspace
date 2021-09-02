package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		
		int num = 15;
//		int num = 10;
		
		if (num==15) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		//--------------------------------------------------
		
		
		// {}중괄호는 여러 개의 코드를 묶어주는 역할을 한다.
		// 코드 실행 순서에는 영향을 주지 않는다.
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		
		//--------------------------------------------------
		
		//	제어문은 해당 제어문 다음에 오는 코드 한 개 또는 {}중괄호 한 개를
		//제어한다(영향을 준다).
		System.out.println("--------------");
		
		//	제어문에 영향을 받는 코드가 한 줄이어도 {}중괄호를 적어주자.
		if( false ) {
			System.out.println("코드1111");			
		}
		
		System.out.println("코드2222");
		
		//--------------------------------------------------
		System.out.println("------------");
		
		//제어문 ()괄호 뒤에 ; 붙이는거 조심!!
		
		if(false);{
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("hola");
		}
		
		
	}
}
