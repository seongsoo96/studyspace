package stars;
//����� 4��
//1. 	2.	   3.	   4.
//*  	*****	   *	*****
//**	****	  **	 ****
//***	***	     ***	  ***
//****	**	    ****	   **
//*****	*	   *****	    *

import java.util.Scanner;
public class Star04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 4��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		
		for(int i=1; i<=userNumber; i++) {
			String stars = new String();
			
			// ������ ����ϴ� j for��
			for(int j=1; j<=i-1; j++) {
				stars += " ";
			}
			
			// ���� ����ϴ� j for��
			for(int j=i; j <= userNumber; j++) {
				stars += "*";
			};
			
			System.out.println(stars);
		}
		
		scanner.close();
	}	
}
