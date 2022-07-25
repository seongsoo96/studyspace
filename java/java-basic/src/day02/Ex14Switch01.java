package day02;
// 조건문 04: switch
// switch 조건문은
// 조건식이 아니라
// 하나의 변수를 선택해서
// 그 변수의 값들에 대한
// 실행 코드를 우리가 지정하게 된다.

// switch는 다음과 같은 구조를 가진다.
// switch(변수) {
//	  case 값:
//		  실행할 코드;
//		  break;
//	  case 값:
//		  실행할 코드;
//		  break;
//	  case 값:
//		  실행할 코드;
//		  break;
//	  case 값:
//		  실행할 코드;
//		  break;
// }
public class Ex14Switch01 {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("그외입니다.");
			break;
		}

	}
}
