package stars;
//����� 5��

//5.		   6.
//    *		    *********
//   ***		 *******
//  *****	      *****
// *******	       ***
//*********	        *

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 5��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= userNumber; i++) {
			String stars = new String();

			// ������ ����ϴ� j for��
			for (int j = 1; j <= userNumber - i; j++) {
				stars += " ";
			}

			// ���� ����ϴ� j for��
			for (int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}

		scanner.close();
	}
}
