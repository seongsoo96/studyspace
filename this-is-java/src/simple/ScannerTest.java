package simple;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//--------------------------------------
		//버퍼 비우는 nextLine()을 이용한 처리
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		sc.nextLine(); //버퍼비우기
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		//--------------------------------------
		
		//모든 입력을 nestLine()으로 처리하기
		System.out.print("Input Number : ");
		String text = sc.nextLine(); //문자열로 입력받기
		int number = Integer.parseInt( text ); //String - > int
		
		System.out.print("Input String : ");
		String str2 = sc.nextLine();
		
//		Long.parseLong(s)
//		Double.parseDouble(s)
		
		
		
		
		
	}
}
