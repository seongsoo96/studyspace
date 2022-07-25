package day04;
// 무한루프

// 무한루프란
// 반복문이 종료되지 않고 계속 돌아가는 것을 무한루프라고 한다.
// 무한루프를 만드는 방법은 다양하게 있지만
// while을 기준으로 하여 무한 루프를 만들어보자

public class Ex04InfinteLoop {
	public static void main(String[] args) {
		// 무한루프 1번
		// 조건식의 변수가 변화가 없으면?
//		int i = 0;
//		while(i < 1) {
//			System.out.println("무한루프 1번");
//		}

		// 무한루프 2번
		// 항상 참이 나오는 조건식을 써주면?
//		while(0 < 1) {
//			System.out.println("무한루프 2번");
//		}

		// 무한루프 3번
		// 뭐하러 식을 써주나...
		// true를 넣어보자
		while (true) {
			System.out.println("무한루프 3번");
		}

		// System.out.println("프로그램 종료");

	}
}
