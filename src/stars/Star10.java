package stars;
//����� 10��

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

public class Star10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 10��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		for(int i=1; i<=2*userNumber-1; i++) {
			String stars = new String();
			if (i == 1 || i ==2*userNumber-1) {
				// ���� 2*userNumber-1����ŭ
				// stars�� �߰����ش�.
				for(int j = 1; j < 2*userNumber; j++) {
					stars += "*";
				}
			} else if(i < userNumber) {
				// ù���� ������ ���κ�
				
				// ���κп��� ����� ��Ʈ���� upperI
				int upperI = i - 1;
				
				// ���� ���� ����ϴ� j for��
				for(int j=1; j <= userNumber - upperI; j++) {
					stars += "*";
				}
				
				// ��� ������ ����ϴ� j for��
				for(int j=1; j <= 2*upperI-1; j++) {
					stars +=" ";
				}
				
				// ������ ���� ����ϴ� j for��
				for(int j=1; j <= userNumber - upperI; j++) {
					stars += "*";
				}
				
			} else {
				// ���������� ������ �Ʒ��κ�
				
				// �Ʒ��κп��� ����� ��Ʈ���� lowerI
				int lowerI = i - userNumber + 1;
				
				// ���� ���� ����ϴ� j for��
				for(int j = 1; j <= lowerI; j++) {
					stars += "*";
				}
				// �� �ʺ� ����� int���� totalWidth
				int totalWidth = 2 * userNumber - 1;
				
				// ������ ������ ������ int���� spaceWidth
				int spaceWidth = totalWidth - 2*lowerI;
				
				// ������ ����ϴ� j for��
				for(int j = 1; j <= spaceWidth; j++) {
					stars += " ";
				}
				// ������ ���� ����ϴ� j for��
				for(int j = 1; j <= lowerI; j++) {
					stars += "*";
				}
				
			}
			
			
			System.out.println(stars);
		}
	}
}
