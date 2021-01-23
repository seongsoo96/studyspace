package java04_control.loof;

import java.util.Scanner;

public class DoWhile_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
//		do {
//			System.out.println("Input Number(종료=99): ");
//			input = sc.nextInt();
//			
//			System.out.println("입력한 값 : " + input);
//			System.out.println();
//		} while(input !=99);
		
		//-------------------------------------------------------
		
		while( true ) {	//무한루프
			System.out.println("Input Number(종료=99): ");
			input = sc.nextInt();
			
			System.out.println("입력한 값 : " + input);
			System.out.println();
			
			//입력값이 99면 무한루프 중단
			if(input==99) { //조건문, while문 중단 지점
				break;	//반복문 중단코드
			}
		}
		
		
		
		
		
		
	}
}
