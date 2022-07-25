package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		//깊은 복사
		//	1. 복사할 공간 새로 생성하기
		arr2 = new int[arr1.length];
		
		//	2. 데이터 복사 ( System클래스의 배열 복사 메소드(기능) 사용 )
		//		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//		src: 원본 배열
		//		srcPos: 원본 배열에서 복사가 시작될 인덱스
		//		dest: 사본 배열
		//		destPos: 사본 배열에서 복사가 시작될 인덱스
		//		length: 복사가 될 요소의 개수
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//arr1의 0번째 인덱스부터 arr2의 0번째 인덱스에 arr1.length만큼 복사한다
		
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
