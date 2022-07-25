package stars;
//별찍기 8번
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
		System.out.println("별찍기 8번");
		System.out.print("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		for(int i=1; i<=2*userNumber-1; i++) {
			String stars = new String();
			
			if(i<userNumber) {
				// 윗부분

				// 공백을 담당하는 j for문
				for(int j=1; j <= userNumber - i; j++) {
					stars += " ";
				}
				
				// 별을 담당하는 j for문
				for(int j = 1; j<=i; j++) {
					stars += "*";
				}
				
			} else {
				// 아래부분
				// userNumber가 5일때
				// i가 5 6 7 8 9 이면
				// else로 들어오게 된다.
				
				// 별찍기 4번에서는 i가 1 2 3 ...일때
				// 기준으로 만들어졌으므로
				// 우리도 여기서 i를 그대로 사용하는 것이 아니라
				// 아래부분용 i를 만들어서 쓰면 간편하다.
				
				// userNumber가 5일때
				// 5 6 7 8 9 를
				// i - userNumber + 1 하면 된다.
				
				// 아래부분용 변수를 하나 만들어주자
				
				int lowerI = i - userNumber + 1;
				
				// 공백을 담당하는 j for문
				for(int j=1; j<=lowerI-1; j++) {
					stars += " ";
				}
				
				// 별을 담당하는 j for문
				for(int j=lowerI; j <= userNumber; j++) {
					stars += "*";
				};
			}
			
			System.out.println(stars);
		}
		
		scanner.close();
	}
}
