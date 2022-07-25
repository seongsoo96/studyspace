package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		//2차원 배열
		
		int num; //int형 변수 -> 정수값 1개 저장
		
		int[] arr1D; // int형 배열 -> int형 변수 여러개(묶음)
		
		int[][] arr; //int형 2차원 배열 -> int형 배열 여러개(묶음)
		
		//---------------------------------
		
		arr = new int[2][3]; //2차원 배열 생성
		//(int[3])[2]
		//-> 2행 3열짜리 int형 표가 만들어진 것과 같다
		
		arr[1][2] = 555; ///1번째행, 2번째열 요소
		System.out.println(arr[1][2]);
		
		//---------------------------------
		
		//---- 배열의 선언 ---
		int[] arr2; //추천
		int arr3[];
		
		int[][] arr4; //비추천
		int[] arr5[];
		int arr6[][];
		
	}
}
