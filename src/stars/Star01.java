package stars;
// ����� 1��
//1. 	2.	   3.	   4.
//*  	*****	   *	*****
//**	****	  **	 ****
//***	***	     ***	  ***
//****	**	    ****	   **
//*****	*	   *****	    *
import java.util.Scanner;
public class Star01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 1��");
		System.out.print("����� �� ��: ");
		int userNumber = scanner.nextInt();
		
		// i for���� ���� ũ�⸦ ����ϰ�
		// j for���� �� ���� ���� ������ ����Ѵ�.
		for(int i=1; i<=userNumber; i++) {
			// ����� ������ ���� String ���� ����
			String stars = new String();
			for(int j=0; j<i; j++) {
				stars = stars + "*";
			}
			
			// j for���� ������ �� ���� ������ �����ǹǷ�
			// System.out.println()���� stars���
			System.out.println(stars);
		}
		
		scanner.close();
	}

}
