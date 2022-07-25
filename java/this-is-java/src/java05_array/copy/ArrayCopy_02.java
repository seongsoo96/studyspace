package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		//배열 복사하기 - 깊은 복사
		int[] arr1 = {10, 20, 30}; //원본, Source
		int[] arr2; //사본, Destination
		
		//--- 깊은 복사, Deep Copy ---
		//	참조 대상의 내용물(Heap메모리공간)을 새로운 공간에 복사하는 것
		
		//	원본데이터의 분리된 저장공간을 가지게 된다
		//----------------------------
		
		//	1. 복사될 공간을 새로 생성한다
		arr2 = new int[arr1.length];
		
		//	2. 데이터를 복사한다. (for문 이용)
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i]; //사본 <- 원본
		}
		
		//----------------------------
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		arr1[1] = 777; //arr1의 1번째 요소만 데이터 변경
		
		System.out.println("--- 1번째 요소값 변경 후 ---");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}
}
