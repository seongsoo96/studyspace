package day02;
// 조건문 03: if-else if 구조
// if-else if 구조에서는
// 우리가 조건식을 여러개를 넣어서
// 가장 먼저 true가 나오는 하나의 코드 블락만 실행을 하게 된다.
// 만약 가장 마지막이 else로 끝난다면
// 위의 조건이 모두 false일때 해당 else 코드블락이 실행되게 된다.

// else if 의 경우
// if가 붙기 때문에 반드시 조건문이 ()에 담겨서 같이 넘어와야한다.

// if-else if는 다음과 같은 구조를 가진다.
// if(조건식1) {
//
// } else if (조건2) {
//
// }...
// } else {
// }
public class Ex09IfElseIf {
	public static void main(String[] args) {
		int age = 5;
		if(age <= 5 ) {
			System.out.println("유아입니다.");
		} else if (age <= 13) {
			System.out.println("어린이입니다.");
		}else if(age < 18) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("성인입니다.");
		}
	}
}
