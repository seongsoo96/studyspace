package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//변수의 값 복사하기
		int num1 = 100;
		int num2;
		
		num2 = num1; //num1의 값이 num2에 복사됨
		
		System.out.println("num1 : num2 = " + num1 + " : " + num2);
		
		System.out.println("------------------");
		
		//배열 복사하기
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		arr2 = arr1; //복사
		
		//--- 얕은 복사, Shallow Copy ---  <--> Deep Copy
		//	참조 대상의 참조값(주소값)만 복사되는 현상
		
		//	데이터를 저장하고 있는 공간(new로 생성된 공간)이 복사되지 않는다
		
		//	원본, 사본 참조 변수 둘 다 같은 메모리공간(Heap메모리공간)을 참조하게 된다
		//-------------------------------
		
		
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














