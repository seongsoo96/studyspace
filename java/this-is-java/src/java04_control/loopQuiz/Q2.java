package java04_control.loopQuiz;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
//		어떤 수의 약수를 구하는 프로그램을 작성하여라
//		약수 = 어떤 수를 정수로 나눌 수 있는 수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력: ");
		int num = sc.nextInt();
		System.out.println(num+"의 약수");
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
