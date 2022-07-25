package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		//new
		//	동적 할당 연산자
		
		//	**정적 할당: 변수 선언
		//	**동적 할당: new연산자를 이용한 공간 생성
		
		//	할당: 변수 공간이 생성됨(저장 공간 생성)
		
		//	정적, static : 실행되기 직전
		//	동적, dynamic : 실행 중
		
		//----------------------------------------------
		
		int num; //int형 변수 선언 -> 정적 할당
		
		int[] arr; //int[]형 변수 선언 -> 정적 할당
		
		//----------------------------------------------
		
		arr = new int[5]; //int[5] 배열 공간 생성 -> 동적 할당
		
		//동적 할당된 저장 공간들은 Heap메모리영역에 생성된다
		
		//----------------------------------------------
		
//		int[] arr2 = new int[-7]; //NegativeSizeArraySizeException
		
		//배열 생성(new)은 동적 할당
		//	-> 컴파일시점에는 에러인지 모르고 실행해보고 알게 된다
		
		//----------------------------------------------
		
		int[][] arr3 = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(i + "행 배열의 길이는? ");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
