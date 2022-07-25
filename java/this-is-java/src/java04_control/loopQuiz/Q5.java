package java04_control.loopQuiz;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
//		1에서부터 입력된 어떤 수까지 내에 있는 소수를
//		찾는 프로그램을 작성하라.
//		* 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
//		* ex) 2,3,5,7,11,13, ...
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력 >> ");
//		int input = sc.nextInt();
//		
//		int primeNum; // 소수 변수
//		boolean isPrimeNum= false; //소수에 대한 flag변수
//		
////		System.out.println(1 + "\t- 소수X");
//		System.out.println(2 + "\t- 소수O");
//		
//		for(primeNum=1; primeNum<=input; primeNum++) { //i, 2~10, x8
//			
//			for(int i=2; i<=input-1; i++) {
//				if(primeNum>i) {
//					if(primeNum%i==0) {
//						isPrimeNum = false;
//						break;
//					} else {
//						isPrimeNum = true;
//					}
//				} else {
//					break;
//				}
//			}
//			if (isPrimeNum == true) {
//				System.out.println(primeNum + "\t- 소수O");
//			} 
//		}
		
		//--------------------------------------------
		// 강사님 코드
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		boolean flag = false; //소수판별 플래그
		
		for(int i=1; i<=num; i++) {
			// 예외상황 : 1은 소수가 아님 
			if(i==1) {
				System.out.println(i + " 은/는 소수가 아님");
				continue;
			}
			
			flag = false;
			
			// 숫자 한 개에 대한 소수 판별
			for(int j=2; j<=i-1; j++) {
				if( i%j==0 ) {
					flag = true;
					
//					break; //약수가 하나라도 존재하면 더 이상 약수를 찾지 않음.
				}
			}
	
			if(flag == true) {
				System.out.println(i + " 은/는 소수가 아님");
			} else {
				System.out.println(i + " 은/는 소수");
			}
		}
		
	}
}
