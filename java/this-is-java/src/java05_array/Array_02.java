package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		int num = 100; //변수의 선언과 동시에 초기화
		
		//--------------------------------------------
		
		//배열의 선언과 동시에 초기화
		int[] arr = {1, 2, 3, 4, 5};
		String[] names = {"James", "Mike"};
//		int arr;
//		arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		//배열의 모든 요소 출력
		for(int i=0; i<5; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}		
		System.out.println(names[1]);
		//--------------------------------------------
		
		char[] chArr = { 'a', 'p', 'p', 'l', 'e'};
		
		double[] dbArr = {1.1, 2.2, 3.3, 4.4};
		
		boolean[] bArr = { true, false, true, false};
	}
}
