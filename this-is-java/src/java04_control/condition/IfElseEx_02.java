package java04_control.condition;

import java.util.Scanner;

public class IfElseEx_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number: ");
		int num = sc.nextInt();
		
		//입력한 숫자가 홀수/짝수 판별하는 코드 작성
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
