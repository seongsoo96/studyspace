package stars;
//����� 7��
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
		System.out.println("����� 7��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();

		// 1~userNumber-1������ ���κ����� ��������
		// ���κ��� ����ϴ� i for��
		for (int i = 1; i <= userNumber - 1; i++) {
			String stars = new String();

			for (int j = 1; j <= i; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}

		// �Ʒ��κ��� ����ϴ� i for��
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
