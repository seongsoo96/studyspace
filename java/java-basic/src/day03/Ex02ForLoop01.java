package day03;
// 제어문 02 - 반복문
// 반복문이란 특정 조건을 만족하는 동안
// 해당 코드블락을 반복시키는 명령문을 반복문이라고 한다.

// 반복문에는 크게 for 반복문과 while 반복문이 있다.
// for 반복문: 비교적 명확한 횟수동안 코드를 반복
// while 반복문: "조건이 true인 동안" 코드를 반복

// for 반복문은 다음과 같은 형태이다.
// for(제어변수; 조건식; 제어변수의 변화식) {
//	   반복할 코드
// }
public class Ex02ForLoop01 {
	public static void main(String[] args) {
		// 전통적으로 for 반복문의 제어변수는
		// i, j, k 순으로 들어가지만
		// 변수이므로 이름은 크게 상관 없다.
		for(int i=1; i <= 5; i++) {
			System.out.println("i의 현재값: "+i);
		}
		
		// for 반복문은 다음과 같은 구동 원리를 가진다.
		// 1. 제어변수의 선언과 초기화
		// 2. 조건식 체크
		//	  A. 조건식이 true가 나오면
		//		 가. 코드 블락 실행
		//		 나. 변화식 실행
		//	  B. 조건식이 false가 나오면 반복문 종료
		
		// for문과 관련된 팁들
		// 1. 제어변수의 초기화나 조건식에 변수가 들어갈 수도 있다.
		int number = 3;
		int number2 = 5;
		for(int i = number; i <= number2; i++) {
			System.out.println("i의 현재값: "+i);
		}
		
		// 2. 제어변수의 선언과 초기화는 밖으로 빼줄 수는 있지만
		//	  ; 의 갯수는 반드시 ()안에 2개가 있어야 한다.
		int i =1;
		for(; i<= number; i++) {
			System.out.println("i의 현재값: "+i);
		}
		
		// 3. for문 ()안에서 제어변수를 선언하면
		//	  해당 제어변수의 스코프는 for문 내부가 된다.
		for(int j = 1; j <= 3; j++) {
			System.out.println("j의 현재값: "+ j);
		}
		//System.out.println(j); 에러발생
		
		// 4. 만약 변화식이 없거나
		//	  변화식이 적용되어도 절대 조건식의 결과가
		//	  false가 나올 수 없는 형태가 되면
		//	  무한루프가 된다.
		for(int j=1; j <= 2; j--) {
			System.out.println("무한루프");
		}
	}
}
