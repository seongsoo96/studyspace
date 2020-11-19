package ssl.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a,b;
		
		//입력: 키보드로 두 수를 입력받는다.
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력하세요.");
		s1 = scan.next();
		s2 = scan.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력: 화면에 두 수의 합력 출력한다.
		System.out.printf("%d와 %d의 합은 %d입니다.",a, b, a + b);
		scan.close();
	}

}
