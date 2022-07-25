package java06_class.method;

public class Method_01 {
	
	//0. 메소드의 기본형태 작성
	public void method(/*매개 변수*/) {
		//실행코드
	}
	//1. 메소드 이름 -> 만들고자 하는 기능을 대표하는 이름으로 정하기
	//2. 매개변수 작성 -> 기능을 수행할 때 필요한 데이터를 저장하는 변수
	//3. 실행코드 작성 -> 메소드가 수행할 기능을 작성, 구현
	//4. return코드 작성 -> 수행 결과로 사용할 값을 반환하는 코드
	//5. return타입 작성 -> return코드로 사용한 값의 데이터타입을 명시한다
	
	//---------------------------------------------------------------------
	
	//2개의 정수를 덧셈하는 기능(메소드)
	
	public int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		return sum;
	}
	//1. 메소드 이름 -> 덧셈 기능, add
	//2. 매개변수 작성 -> () 2개의 정수, int num1, int num2
	//3. 실행코드 작성 -> {} 2개의 정수 덧셈, int sum = num1 + num2
	//4. return코드 작성 -> 덧셈 결과 리턴, return sum;
	//5. return타입 작성 -> 리턴값의 데이터타입, int
	
}
