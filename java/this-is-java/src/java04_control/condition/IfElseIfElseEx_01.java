package java04_control.condition;

public class IfElseIfElseEx_01 {
	
	public static void main(String[] args) {
		
		// if ~else if ~ else
		
//	if( 조건식1 ) {
//		조건식1이 참일 때 수행하는 영역
//	} else if( 조건식2 ) {
//		조건식1이 거짓이고
//		조건식2가 참일때 수행하는 영역
//	} else if( 조건식3 ) {
//		조건식1이 거짓이고
//		조건식2도 거짓이고
//		조건식3이 참일 때 수행하는 역역
//	} else {
//		조건식1, 2, 3 모두가 거짓일 때 수행하는 영역
//	}
		
		//**else만 사용하는 구문은 if문이 마지막으로만 올 수 있다.
		//**else, else if 구문은 필수가 아니다(없어도 된다)
		//**if문 없이 else, else if만 사용할 수 없다.
		
		
		//--------------------------------------------------
		
		int num = 77;
		
		if(num ==10) {
			System.out.println("10입니다");
		} else if( num ==20 ) {
			System.out.println("20입니다");
		} else if(num ==30) {
			System.out.println("30입니다");
		} else {
			System.out.println("10, 20, 30 모두 아닙니다");
		}
		
	}
	
}
