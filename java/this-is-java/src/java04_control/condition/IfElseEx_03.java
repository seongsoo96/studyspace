package java04_control.condition;

import java.util.Scanner;

public class IfElseEx_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		if(num>0 && num<=100) {
			System.out.println("1~100 사이의 정수");
		}

		System.out.println("------------------");

		//** 들여쓰기 자동 정렬 단축키
		//	command + i
		//	(정렬할 코드들보다 전 후로 몇 줄 더 선택해서 사용한다.)

		//	(command + a - 전체코드 선택)
		//	(command + i - 들여쓰기 정렬)

		if(num>0) {	//양수, positive number
			System.out.println("0보다 크다");

			if(num<=100) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
			}
		} else { //양수가 아님, 0, 음수, num<=0
			System.out.println("0보다 크지 않다");
			
			if(num ==0) {
				System.out.println("0입니다");
			} else {
				System.out.println("0이 아닙니다");
				System.out.println("0보다 작다");
			}
		}

	}

}
