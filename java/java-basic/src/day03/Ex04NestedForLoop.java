package day03;
// 중첩 for loop
// 중첩 for loop의 경우
// 바깥쪽 for 반복문이 한번 실행될때마다
// 안쪽 for 반복문은 처음부터 끝까지 반복된다.
// 즉 안쪽 for 반복문의 총 반복횟수는
// i for문의 반복횟수 x j for문의 반복횟수가 된다.

// 또한, i for문과 j for문의 반복횟수는 다를 수도 있다.

public class Ex04NestedForLoop {

	public static void main(String[] args) {
		for(int i = 1; i <=3; i++) {
			System.out.println("--------- i for문"+i+"번 반복중------------");
			for(int j=11; j<=15; j++) {
				System.out.printf("i의 현재값: %d, j의 현재값: %d\n", i, j);
			}
			System.out.println("---------------------------------------");
		}

	}

}
