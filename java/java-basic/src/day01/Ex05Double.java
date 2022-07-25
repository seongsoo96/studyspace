package day01;
// 자바에서의 실수는
// double 혹은 float 데이터타입이 담당한다.
// 하지막 우리가 코드에서 실수를 입력하면
// 자바는 double로 인식하기 때문에
// float에 값을 넣을 때에는
// 명시적 형변환을 하거나
// 아니면 실수값 맨 뒤에 f를 붙여서 실수인 것을 나타내어야 한다.
public class Ex05Double {
	public static void main(String[] args) {
		double myDouble = 3.141592;
		System.out.println("myDouble의 현재값:" + myDouble);
		
		// 아래 코드는 double 값인 3.141592를 더 작은 데이터타입인
		// float에 할당하려고 했기 때문에 에러발생
		//float myFloat = 3.141592;
		
		// 만약 float을 써야하는 경우에는
		// 2가지 방법이 가능한데
		// 1. 명시적 형변환
		float myFloat = (float)3.141592;
		
		// 2. 실수값이 float 형태임을 명시
		myFloat = 3.141592f;
		
		System.out.println("myFloat의 현재값:" + myFloat);
	}
}
