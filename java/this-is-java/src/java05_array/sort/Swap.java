package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap, 자리바꾸기, 교환
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("[스왑전] " + num1 + ", " + num2);
		
		//스왑 코드
		int tmp = num1; //임시변수 tmp에 백업
		num1 = num2; //데이터 저장
		num2 = tmp; //복원
		
		System.out.println("[스왑후] " + num1 + ", " + num2);
		
	}
}
