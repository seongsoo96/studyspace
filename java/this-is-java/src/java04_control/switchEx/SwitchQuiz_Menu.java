package java04_control.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu {
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성
	public static void main(String[] args) {
		
		//메뉴 선택 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;

		Scanner sc = new Scanner(System.in);


		System.out.println("===========================");
		System.out.println("\tM e n u");
		System.out.println("===========================");
		System.out.println("\t1. Hello World 출력");
		System.out.println("\t2. 이름 출력");
		System.out.println("\t3. 성별 출력");
		System.out.println("\t4. 종료");
		System.out.println("===========================");
		System.out.println();
		System.out.print(">> ");
		int num = sc.nextInt();
		System.out.print(">> ");

		switch (num) {
			case HELLO_MENU: //1.Hello World
				System.out.println("Hello World");
				System.out.println();
				break;
			case NAME_MENU:	//2.이름
				System.out.println("이성수");
				System.out.println();
				break;
			case GENDER_MENU:	//3.성별
				System.out.println("남");
				System.out.println();
				break;
			case EXIT_MENU:	//4.종료
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다");
				System.out.println();
		}


	}
}
