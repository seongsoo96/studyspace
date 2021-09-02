package java12_exception;

public class ExceptionEx_02 {
	public static void main(String[] args) {
		
		
		int[] arr = new int[5];
		
		int i=0;
		try {
			while(true) {
				
				arr[i] = i+1; //배열에 값 대입
				System.out.println(arr[i]);
				
				
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("[EXCEPTION] 인덱스 벗어남!!");
			
			//기본으로 사용되는 예외 상황 출력 메소드
			e.printStackTrace();
		}
		System.out.println(" + + + 프로그램 정상 종료 + + +");
	}
}
