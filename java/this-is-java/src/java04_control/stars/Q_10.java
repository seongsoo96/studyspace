package java04_control.stars;

public class Q_10 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println("-------------");
//		
//		for(int i=0; i<5; i++) { //i, 0~4, x5
//			for(int j=0; j<5; j++) { //j, 0~4, x5
//				
//				if(j<i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("--------------");
//		
//		for(int i=0; i<5; i++) { //i, 0~4, x5
//			for(int j=0; j<5; j++) { //j, 0~4, x5
//				
//				System.out.print(j<i ?" " :"*"); //삼항연산자
//				
//			}
//			
//			System.out.println();
//		}
	}
}
