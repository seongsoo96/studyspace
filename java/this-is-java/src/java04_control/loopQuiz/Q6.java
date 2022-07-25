package java04_control.loopQuiz;

import java.util.Scanner;

public class Q6 {
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
		
		boolean isNotAlpha = false;
		
		for(int i=0; i<str.length(); i++) {
			
			// 영문자가 아닐때
			if(!(str.charAt(i)>96 && str.charAt(i)<123) //소문자가 아닐때
				&& !(str.charAt(i)>64 && str.charAt(i)<91)) { //대문자가 아닐때
				isNotAlpha = true;
				break;
			}
		}
		if(isNotAlpha==true) {
			
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
	
//	public class LoopQuiz_Plus {
//		public static void main(String[] args) {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			//무한 루프
//			while(true) {
//				System.out.print("Input String : ");
//				String str = sc.nextLine();
//				
//			
//				System.out.print("Input Character : ");
//				char ch = sc.nextLine().charAt(0);
//				
//				int cnt = 0;
//				boolean isAlpha = true;
//				
//				//문자열을 한 글자씩 비교
//				for(int i=0; i<str.length(); i++) {
//					
//					//대소문자가 아닐경우
//					if( !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
//							&& !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ) {
//						
//						isAlpha = false;
//						break;
//						
//					}
//					
//					//입력한 문자와 같으면 cnt추가
//					if(str.charAt(i) == ch) {
//						cnt++;
//					}
//				}
//				
//				if( isAlpha ) {
//					System.out.println(cnt + "개 입니다");
//				} else {
//					System.out.println("영문자가 아닙니다");
//					break; //무한 반복 종료
//				}
//				
//			}
//		}
//	}


}
