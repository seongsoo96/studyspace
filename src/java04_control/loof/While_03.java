package java04_control.loof;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		
		int i=2;
		while(i<=9) {	
			System.out.println(i + "단입니다.");
			int j=1;
			while(j<=9) {
				System.out.println(i + "x" + j + "=" + i*j);
				
				j++;
			}
			System.out.println();
			i++;
		}
		
//		//다른 학생이 작성한 코드
//		int num1 = 2;
//		int num2 = 1;
//		
//		while(num1 < 10) {
//			if(num2 == 10) {
//				num1 ++;
//				num2 = 1;
//			}
//			if(num1 != 10)
//				System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
//			num2++;
//		}
		
		
		
	}
}
