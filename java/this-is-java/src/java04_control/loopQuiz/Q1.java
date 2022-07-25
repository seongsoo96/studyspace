package java04_control.loopQuiz;

import java.util.Scanner;

public class Q1 {
	//구구단 중 입력받은 수의 단수를 출력하여라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력: ");
		int dan = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
		
	}
}
