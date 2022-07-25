package java04_control.loopQuiz;

import java.util.Scanner;

public class Q7_1 {
	public static void main(String[] args) {
//		 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
//		 문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//		 단, 영문자만 입력받도록 함.
//
//			ex>
//			문자열 입력 : application
//			문자 입력 : p
//			포함된 갯수 : 2 개
//			====================
//			문자열 입력 : apple_test123
//			영문자가 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		boolean isEng = false;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>96 && str.charAt(i)<123) {
				isEng = true;
			} else if(str.charAt(i)>64 && str.charAt(i)<91) {
				isEng = true;
			} else {
				isEng = false;
			}
		}
		if(isEng==false) {
			
			System.out.println("영문자가 아닙니다.");
			
		} else {
			
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int count = 0;
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==ch) {
					count++;
				}
			}
			System.out.println("포함된 개수: " + count);
			
		}
		
		
	}	
}