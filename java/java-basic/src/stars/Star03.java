package stars;
//����� 3��
//1. 	2.	   3.	   4.
//*  	*****	   *	*****
//**	****	  **	 ****
//***	***	     ***	  ***
//****	**	    ****	   **
//*****	*	   *****	    *

import java.util.Scanner;

public class Star03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 3��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		
		for(int i=1; i<=userNumber; i++) {
			String stars = new String();
			
			// ������ ����ϴ� j for��
			for(int j=1; j <= userNumber - i; j++) {
				stars += " ";
			}
			
			// ���� ����ϴ� j for��
			for(int j = 1; j<=i; j++) {
				stars += "*";
			}
			
			
			System.out.println(stars);
		}
		
		scanner.close();
	}
	
}
