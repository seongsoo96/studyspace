package java12_exception.custom;

public class CustomExceptionEx {
	public static void main(String[] args) {
		
		User user = new User();
		
		
		try {
//			user.setAge( -9 );	//예외 발생
			user.setAge(22);	//예외 발생하지 않음 - 정상 흐름
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
