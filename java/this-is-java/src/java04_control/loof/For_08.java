package java04_control.loof;

public class For_08 {
	public static void main(String[] args) {
		
		//제어문 중첩시켜 사용
		
		//if중첩
		int num = 11;
		
		if(num>=1) {
			System.out.println("1보다 크거나 같다");
			
			if(num <= 100) {
				System.out.println("1보다 크거나 같다");
				System.out.println("100보다 작거나 같다");
				
				System.out.println("1~100 사이의 정수");
			}
			System.out.println("1보다 크거나 같다");
		}
		
		//---------------------------------------------
		
		//for문과 if문 중첩
		for(int i=0; i<10; i++) {	//i, 0~9, x10
			
			if(i%2==0) {	//짝수인 경우
				System.out.println("짝수: " +i);
			}
		}
		
		//--------------------------------------------
		System.out.println("----------------");
		
		for(int i=0; i<10; i+=2) {
			System.out.println("짝수: " + i);
		}
		
	}
}
