package java04_control.loopQuiz;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
//		입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//		프로그램을 작성하라.
//		최소공배수 = 공배수 중에서 가장 작은 정수
//		최대공약수 = 공약수 중에서 절대치가 가장 큰 수
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("num1: ");
//		int num1 = sc.nextInt();
//		System.out.print("num2: ");
//		int num2 = sc.nextInt();
//		
//		int max; //둘 중 큰 수
//		int resMin=0; //최소공배수
//		
//		if(num1>=num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		for(int i=max; i>=max; i++) {
//			if(i%num1==0 && i%num2==0) {
//				resMin = i;
//				break;
//			}
//		}
////		System.out.println(num1 + "," + num2 + "의 최소공배수: " + resMin);
//		
//		//-------------------------------------------
//		
//		
//		int min; //둘 중 작은 수
//		int resMax = 0; //최대공약수
//		
//		if(num1<=num2) {
//			min = num1;
//		} else {
//			min = num2;
//		}
//		
//		for(int i=1; i<=min; i++) {
//			if(num1%i==0 && num2%i==0) {
//				resMax = i;
//			}
//		}
//		System.out.println(num1 + "," + num2 + "의 최대공약수: " + resMax);
		
		
		
		
		//강사님 코드
		System.out.print("Input Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Input Number 2 : ");
		int n2 = sc.nextInt();

		
		int lcm=0; //최소공배수
		int max = n1>n2 ?n1 : n2;
		for( int i=max; true; i++ ) {
			if( i%n1==0 && i%n2==0 ) {
				lcm = i;
				break;
			}
		}
		
		
		int gcd=0; //최대공약수
		int min = n1<n2 ?n1 :n2;
		for( int i=1; i<=min; i++ ) {
			if( n1%i==0 && n2%i==0 ) {
				gcd = i;
			}
		}
		
		System.out.println("최소공배수 : "+lcm);
		System.out.println("최대공약수 : "+gcd);
		
	}
}
