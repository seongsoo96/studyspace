package stars;
//별찍기 9번

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

public class Star09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 9번");
		System.out.print("출력할 줄 수: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= 2 * userNumber - 1; i++) {
			String stars = new String();
			if (i < userNumber) {
				// 공백을 담당하는 j for문
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				// 별을 담당하는 j for문
				for (int j = 1; j <= 2 * i - 1; j++) {
					stars += "*";
				}
			} else {
				int lowerI = 2 * userNumber - i;
				// 공백을 담당하는 j for문
				for (int j = 1; j <= userNumber - lowerI; j++) {
					stars += " ";
				}
				// 별을 담당하는 j for문
				for (int j = 1; j <= 2 * lowerI - 1; j++) {
					stars += "*";
				}

			}

			System.out.println(stars);
		}

	}
}
