package stars;
//����� 6��

import java.util.Scanner;

//5.		   6.
//    *		    *********
//   ***		 *******
//  *****	      *****
// *******	       ***
//*********	        *
public class Star06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 6��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		for (int i = userNumber; i >= 1; i--) {
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
