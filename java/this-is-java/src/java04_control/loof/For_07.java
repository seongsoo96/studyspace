package java04_control.loof;

public class For_07 {
//	첫날에 10원을 예금하고,
//	다음날에는 전날의 2배를
//	예금하는 방식으로
//	보름(15일) 동안 저축한 금액은?
//		-> 327670
	public static void main(String[] args) {
		
		//1.		15일동안 반복
		
		//2.
		//	반복횟수: 15번
		//	반복구간: 0~14
		
		//	초기식: int i=0;	(시작값)
		//	조건식: i<15;	(끝값)
		//	증감식: i++
		
		//3.		반복코드로 수행해야할 작업
		//			매일 수행해야할 작업
		//			-> 예금액을 두배로 만들기 (처음 10원)
		//			-> 예금액을 총 금액에 더하기
		
		//----------------------------------
		
		int money = 10; //예금액
		int account = 0; //총 예금액
		
		//15일동안...
		int i;
		for(i=0; i<15; i++) {
			
			account += money *(int)Math.pow(2, i); // money * 2^i
			
//			//총 금액에 예금액을 더하기
//			account += money;
//
//			//예금액 두배로 만들기
//			money *= 2;
			
		}
		System.out.println(i + "일 동안 저축한 총 금액 : " + account + "원");
		
		
		
	}
}
