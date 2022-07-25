package java06_class.etc;

import java.util.Scanner;

public class MathRandom {
	public static void main(String[] args) {
		
		//class java.lang.Math
		//	기능 : 산술적인 연산을 메소드로 제공한다
		
		//	메소드들이 전부 static으로 정의되어있따
		
		//-------------------------------------------
		
		//public static double java.lang.Math.random()
		
		//	0.0보다 크거나 같고 1.0보다 작은 Pseudorandom 실수(double)값 반환
		
		//	** Pseudorandom, 수도 랜덤, 슈도 랜덤
		//		가짜(꾸며낸) 무작위
		
		//	** Pseudo, 슈도, 수도 == 꾸며낸(가짜의)
		
		//-------------------------------------------
		
		System.out.println( Math.random() ); // 0.0 ~ 0.999999999999999
		
		System.out.println( Math.random() * 10 ); // 0.0 ~ 9.99999999999
		
		System.out.println( (int)Math.random() * 10 ); // 0 ~ 9
		
		System.out.println( (int)Math.random() * 10 + 1); // 1 ~ 10
		
		//-------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int com = (int)Math.random()*3; // 0 ~ 2, 3개의 숫자 중 랜덤
			
			System.out.print("0~2 중에서 맞춰보세요(종료=9) : ");
			int user = sc.nextInt();
			
			if( user == 9 ) {
				break;
			}
			
			if( com == user ) {
				System.out.println("맞춤!!!");
			} else {
				System.out.println("틀림!!!");
			}
			System.out.println("---------");
		}
		
		
	}
}
