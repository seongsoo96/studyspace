package stars;
//����� 8��
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

public class Star08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 8��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		for(int i=1; i<=2*userNumber-1; i++) {
			String stars = new String();
			
			if(i<userNumber) {
				// ���κ�

				// ������ ����ϴ� j for��
				for(int j=1; j <= userNumber - i; j++) {
					stars += " ";
				}
				
				// ���� ����ϴ� j for��
				for(int j = 1; j<=i; j++) {
					stars += "*";
				}
				
			} else {
				// �Ʒ��κ�
				// userNumber�� 5�϶�
				// i�� 5 6 7 8 9 �̸�
				// else�� ������ �ȴ�.
				
				// ����� 4�������� i�� 1 2 3 ...�϶�
				// �������� ����������Ƿ�
				// �츮�� ���⼭ i�� �״�� ����ϴ� ���� �ƴ϶�
				// �Ʒ��κп� i�� ���� ���� �����ϴ�.
				
				// userNumber�� 5�϶�
				// 5 6 7 8 9 ��
				// i - userNumber + 1 �ϸ� �ȴ�.
				
				// �Ʒ��κп� ������ �ϳ� ���������
				
				int lowerI = i - userNumber + 1;
				
				// ������ ����ϴ� j for��
				for(int j=1; j<=lowerI-1; j++) {
					stars += " ";
				}
				
				// ���� ����ϴ� j for��
				for(int j=lowerI; j <= userNumber; j++) {
					stars += "*";
				};
			}
			
			System.out.println(stars);
		}
		
		scanner.close();
	}
}
