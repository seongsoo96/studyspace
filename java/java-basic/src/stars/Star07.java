package stars;
//별찍기 7번
//7.	    8.	    9.		      10.

//*	            *	    *	     *********
//**	       **	   ***	     **** ****
//***	      ***	  *****	     ***   ***
//****	     ****	 *******     **     **
//*****	    *****	*********	 *       *
//****	     ****	 *******     **     **
//***	      ***	  *****	     ***   ***
//**	       **	   ***	     **** ****
//*	            *	    *	     *********

import java.util.Scanner;

public class Star07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 7번");
		System.out.print("출력할 줄 수: ");
		int userNumber = scanner.nextInt();

		// 1~userNumber-1까지를 윗부분으로 지정하자
		// 윗부분을 담당하는 i for문
		for (int i = 1; i <= userNumber - 1; i++) {
			String stars = new String();

			for (int j = 1; j <= i; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}

		// 아랫부분을 담당하는 i for문
		for (int i = 1; i <= userNumber; i++) {
			String stars = new String();

			for (int j = i; j <= userNumber; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}

		scanner.close();
	}
}
