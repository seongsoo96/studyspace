package day01;
// 연산자
// 연산자란 프로그래밍에서
// 특정 기호에 기능을 구현해놓고
// 우리가 그 기호를 쓰면
// 해당하는 기능이 실행되게 된다.
// 연산자는 크게 5가지로 나뉜다.
// 1. 산술 연산자
// 2. 할당 연산자
// 3. 비교 연산자
// 4. 논리 연산자
// 5. 비트 연산자 -> 자바에서 잘 안쓴다.

// 산술 연산자
// 산술 연산자란
// 두 개의 값을 더하고 빼고 곱하고 나누고 나머지를 구해주는 연산자이다.
// + - * / % ++ --
public class Ex08Operator01 {
	public static void main(String[] args) {
		int myInt = 3;
		int myInt2 = 4;
		
		System.out.println("myInt + myInt2: " + (myInt + myInt2));
		System.out.println("myInt + myInt2: " + (myInt - myInt2));
		System.out.println("myInt + myInt2: " + (myInt * myInt2));
		System.out.println("myInt + myInt2: " + (myInt / myInt2));
		System.out.println("myInt + myInt2: " + (myInt % myInt2));
		
		// 정수간에 나눗셈의 경우
		// 오직 몫만 나오게 된다.
		// 예를 들어 3 / 4의 몫은 0이므로
		// 결과값은 0이 된다.
		
		// % 연산자는 두 숫자의 나눗셈의 나머지를 구해준다.
		// 즉 3 / 4의 경우 나머지가 3이므로
		// 3 % 4의 결과값은 3이 된다.
		
		// + - * / % 의 경우
		// 정수와 정수는 결과값이 정수가 나오고
		// 정수와 실수 혹은 실수와 실수는 결과값이 실수가 나온다.
		// 단 한가지 주의할 점은
		// /의 경우 정수 나눅 ㅣ정수의 결과값을 시수에 넣게 되면
		// 부정확한 값이 나온다.
		
		double result = myInt / myInt2;
		System.out.println("result의 현재값:" + result);
		// 위의 코드는 결과값이
		// 0.0이 나온다.
		// 왜냐하면 myInt / myInt2 는 결과값이 0이다.
		// 0을 double로 바꾸면?
		// 0.0이 되기 때문이다!
		
		// 따라서 나눗셈의 소숫점을 확인하려면
		// 정수 / 실수를 통해서 결과값을 실수로 받아야 한다.
		result = (double)myInt / myInt2;
		System.out.println("result의 현재값:" + result);
		
		// ++, -- 는 특이한 연산자로써
		// 해당 공간의 값을 1씩 증가시키거나 감소시킨다.
		
		// 단 ++ -- 가 앞에 붙냐 뒤에 붙냐에 따라서
		// 값의 변화 시점이 달라지게 된다.
		System.out.println("myInt의 현재값:" + myInt);
		
		// ++ 혹은 -- 가 변수의 앞에 붙을 경우에는
		// 해당 줄에서 가장 먼저 실행이 된다.
		System.out.println("++myInt의 현재값:" + ++myInt);
		System.out.println("myInt의 현재값:" + myInt);
		
		// ++ 혹은 -- 가 변수의 뒤에 붙을 경우에는
		// 해당 줄에서 가장 나중에 실행이 된다.
		System.out.println("myInt++의 현재값:" + myInt++);
		System.out.println("myInt의 현재값:" + myInt);
		
		// String의 경우 +의 의미가 달라지게 된다.
		// String의 뒤에 +가 붙게 되면
		// 뒤의 내용을 String으로 변환하여
		// 2개의 String을 이어서 하나의 String으로 만들라는 의미가 된다.
		System.out.println(123+456);
		System.out.println("123"+456);
	}

}
