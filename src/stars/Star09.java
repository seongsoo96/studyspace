package stars;
//����� 9��

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
		System.out.println("����� 9��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= 2 * userNumber - 1; i++) {
			String stars = new String();
			if (i < userNumber) {
				// ������ ����ϴ� j for��
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				// ���� ����ϴ� j for��
				for (int j = 1; j <= 2 * i - 1; j++) {
					stars += "*";
				}
			} else {
				int lowerI = 2 * userNumber - i;
				// ������ ����ϴ� j for��
				for (int j = 1; j <= userNumber - lowerI; j++) {
					stars += " ";
				}
				// ���� ����ϴ� j for��
				for (int j = 1; j <= 2 * lowerI - 1; j++) {
					stars += "*";
				}

			}

			System.out.println(stars);
		}

	}
}
