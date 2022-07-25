package day01;
// 논리연산자
// 논리연산자는
// boolean 값에 대한 연산을 한다.
// &&: 2개가 모두 true이면 true
// ||: 2개 중 하나라도 true이면 true
// !: true값은 false로 바꾸고 false값은 true로 바꾼다.
public class Ex11Operator04 {

	public static void main(String[] args) {
		// && 연산자는
		// 두개의 값이 모두 true일때만 결과가 true가 나온다.
		// 만약 앞의 값이 false가 나오면 뒤의 값은 체크도 안한다.
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		// || 연산자는
		// 2개의 값 중 하나라도 true이면 true가 나온다.
		// 만약 앞의 값이 true가 나오면 뒤의 값은 체크도 안한다.
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));

	}

}
