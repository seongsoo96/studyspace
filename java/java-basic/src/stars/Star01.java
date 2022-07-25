package stars;
// 별찍기 1번
//1. 	2.	   3.	   4.
//*  	*****	   *	*****
//**	****	  **	 ****
//***	***	     ***	  ***
//****	**	    ****	   **
//*****	*	   *****	    *
import java.util.Scanner;
public class Star01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 1번");
		System.out.print("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		// i for문은 세로 크기를 담당하고
		// j for문은 각 줄의 별의 갯수를 담당한다.
		for(int i=1; i<=userNumber; i++) {
			// 출력할 내용을 담을 String 변수 선언
			String stars = new String();
			for(int j=0; j<i; j++) {
				stars = stars + "*";
			}
			
			// j for문이 끝나면 그 줄의 내용이 결정되므로
			// System.out.println()으로 stars출력
			System.out.println(stars);
		}
		
		scanner.close();
	}

}
