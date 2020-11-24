package day02;
// 중첩 if를 사용한 예제
// 사용자로부터 성별, 나이, 신체등급을 입력받아
// 현역, 공익, 면제 를 출력하는 프로그램
// 단 여자일 경우엔 나이 신체등급을 입력받지 않고
// 남자 미성년자일 경우엔 신체등급을 입력받지 않는다.

import java.util.Scanner;
public class Ex12NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별(남자는 1 여자는 2): ");
		int sex = scanner.nextInt();
		if (sex == 1) {
			// 남자이므로 나이를 입력받는다.
			System.out.print("나이: ");
			int age = scanner.nextInt();
			if (age >= 18) {
				// 성인이므로 신체등급을 입력받는다.
				System.out.print("신체등급: ");
				int category = scanner.nextInt();
				if(category <= 3) {
					System.out.println("현역입니다.");
				} else if (category == 4) {
					System.out.println("공익입니다.");
				} else {
					System.out.println("면제입니다.");
				}
			} else {
				// 미성년자이므로 메시지만 출력
				System.out.println("아직 미성년자입니다.");
			}
		} else {
			// 여자이므로 메시지만 출력
			System.out.println("여성에게는 국방의 의무가 없습니다.");
		}
		

		
		scanner.close();
	}

}
