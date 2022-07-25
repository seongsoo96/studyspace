package java12_exception;

public class ExceptionEx_04 {
	public static void main(String[] args) {
		
		String str = null;
		
		//--------------------------------
		//NullPointerException 발생 - 자연적으로 예외 발생
//		System.out.println( str.length() );
		
		//--------------------------------
		if( str==null ) {
			
//			System.out.println("[ERROR] 문자열이 null입니다");
//			System.out.println();
			
			//직접 예외 발생시키기
//			throw new NullPointerException();
			
		} else {
			System.out.println( str.length() );
		}
		
		//--------------------------------
		
		//예외 정보 객체 생성 (throw 되지 않는다)
		NullPointerException e = new NullPointerException();
		
		if( str==null ) {
			throw e; //예외발생
		}
		
		//예외 객체를 생성(new)한다고 해서 예외가 발생(throw)되는 것은 아니다
		
		//예외 발생 위치는 객체를 생성된 곳으로 지정된다
		
		//	-> throw에서 곧바로 new로 예외객체를 만드는 것이 좋다
		
	}
}
