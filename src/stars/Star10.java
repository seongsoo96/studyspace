package stars;
//별찍기 10번

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
		System.out.println("별찍기 10번");
		System.out.print("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		for(int i=1; i<=2*userNumber-1; i++) {
			String stars = new String();
			if (i == 1 || i ==2*userNumber-1) {
				// 별을 2*userNumber-1개만큼
				// stars에 추가해준다.
				for(int j = 1; j < 2*userNumber; j++) {
					stars += "*";
				}
			} else if(i < userNumber) {
				// 첫줄을 제외한 윗부분
				
				// 윗부분에서 사용할 인트변수 upperI
				int upperI = i - 1;
				
				// 왼쪽 별을 담당하는 j for문
				for(int j=1; j <= userNumber - upperI; j++) {
					stars += "*";
				}
				
				// 가운데 공백을 담당하는 j for문
				for(int j=1; j <= 2*upperI-1; j++) {
					stars +=" ";
				}
				
				// 오른쪽 별을 담당하는 j for문
				for(int j=1; j <= userNumber - upperI; j++) {
					stars += "*";
				}
				
			} else {
				// 마지막줄을 제외한 아랫부분
				
				// 아랫부분에서 사용할 인트변수 lowerI
				int lowerI = i - userNumber + 1;
				
				// 왼쪽 별을 담당하는 j for문
				for(int j = 1; j <= lowerI; j++) {
					stars += "*";
				}
				// 총 너비를 계산할 int변수 totalWidth
				int totalWidth = 2 * userNumber - 1;
				
				// 공백의 갯수를 저장할 int변수 spaceWidth
				int spaceWidth = totalWidth - 2*lowerI;
				
				// 공백을 담당하는 j for문
				for(int j = 1; j <= spaceWidth; j++) {
					stars += " ";
				}
				// 오른쪽 별을 담당하는 j for문
				for(int j = 1; j <= lowerI; j++) {
					stars += "*";
				}
				
			}
			
			
			System.out.println(stars);
		}
	}
}
