package java12_exception;

public class ExceptionEx_03 {
	public static void main(String[] args) {
		
		try {
			//try블록
			//예외 발생이 예측되는 코드를 작성함

		} catch (NullPointerException e) {
			//NullPointerException 발생시 처리하는 코드
			
		} catch (ArrayIndexOutOfBoundsException e) {	
			//ArrayIndexOutOfBoundsException 발생시 처리하는 코드
			
		} catch (Exception e) {
			//NullPointerException 과
			//ArrayIndexOutOfException 을 제외한 모든 예외를 처리함
			
		}
		
		//catch구문을 여러개 작성할 수 있다
		
		//---------------------------------------------
		
		//multi catch 구문
		//	-> catch구문에 예외타입을 한꺼번에 여러개 적는 방법
		
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			// NullPointerException 과
			// ArrayIndexOutOfBoundsException 을 동시에 처리하기
			
		} catch (Exception e) {
			//남은 예외 전부 처리하기
			
		}


		
		
		
		
		
		
		
		
	}
}
