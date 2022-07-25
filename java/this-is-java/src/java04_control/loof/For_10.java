package java04_control.loof;

public class For_10 {
	public static void main(String[] args) {
		
		//중첩된 for loop
		//	2~9단 구구단
		
		//1.	2~9단 반복
		//2.	각 단에서 구구단 반복
		
		//단 수를 반복하는 dan 반복
		
		for(int dan=2; dan<=9; dan++) {	//dan, 2~9, x8
			
			//각 단을 출력하는 i반복
			for(int i=1; i<=9; i++) {
				System.out.print(dan + "x" + i + "=" + dan*i + " ");
			}
			System.out.println();
		}
		
		for( int i=1; i<=9; i++ ) {

			//단 수를 반복하는 dan 반복문
			for( int dan=2; dan<=9; dan++ ) { // dan, 2~9, 8번
				System.out.print(dan + "x" + i + "=" + i*dan + "  ");
			}

			System.out.println();

		}
		
		
		
		
		
		
		
		
		
	}
}
