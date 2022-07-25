package java05_array;

public class Array_01 {
	public static void main(String[] args) {
		
		String str = new String();
		str = "apple";
		
		//배역, array
		//	변수들의 나열, 묶음
		
		//-----------------------------------------
		
		int num; //int형 변수 선언
		num = 123; //변수에 값 대입
		
		//-----------------------------------------
		
		//	int[]
		//		int형 배열 타입
		//		int형 변수공간을 여러 개 관리하는 데이터타입
		//		참조형타입이다
		
		int[] arr; //ing형 배열 변수 선언
		arr = new int[5]; //int형 배열 생성( int 5개 )
		
		//배열 생성 시 변수 공간이 묶음으로 만들어진다
		
		//-----------------------------------------
		
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		
//		arr[5] = 66; //ArrayIndexOutOfBoundsException: 5
		//	-> int[5] 배열은 0~4의 인덱스를 가진
		
		//-----------------------------------------
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			arr[i] = (i+1) * 100;
		}
		for(int i=0; i<5; i++ ) { //i, 0~4, x5
			System.out.println( arr[i] );
		}
		
		//-----------------------------------------
		System.out.println("----------------");
		
		//배열의 이름을 출력하기
		System.out.println( arr );
		
		// [I	@	2a139a55		-> 참조값, Reference
		
		//	참조값 : 데이터가 저장되어있는 메모리의 주소
		
		//	참조형변수 : 참조값을 저장할 수 있는 변수
		
		
		
	}
}
