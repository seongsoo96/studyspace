package java02_operator;

public class TernaryEx {
	public static void main(String[] args) {
		
		//삼항연산자 - 조건
		//	조건연산자
		//	삼항조건연산자
		
		//		조건식 ?조건식이 참일때 반환값 :거짓일때 반환값
		
		//		**조건식 - true/false로 판별 가능한 연산식
		
		//------------------------------------------------------
		
		int num1 = 30, num2 = 20;
		
		System.out.println( num1<num2 ?"num1이 크다" :"num1이 크지 않다" );
		
		//------------------------------------------------------
		
		String resultText = num1<num2 ?"num1이 크다" :"num1이 크지 않다";
		
		//------------------------------------------------------
		
		//num1과 num2 중에서 큰 숫자를 변수에 저장한다
		int result = num1>num2 ?num1 :num2;
	
	}
}
