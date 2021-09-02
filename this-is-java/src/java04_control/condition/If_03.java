package java04_control.condition;

import java.util.Scanner;

public class If_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.print("Input Number: ");
		int input = sc.nextInt();
		
		if(input ==10) {
			System.out.println("입력값은 10입니다.");
		}
		
		if(input != 10) {
			System.out.println("입력값은 10이 아닙니다.");
		}
		
		if(input >=1 && input <=100) {
			System.out.println("입력값이 1~100 사이의 정수입니다.");
		}
		
		
		
		
		
		
		
	}
}
