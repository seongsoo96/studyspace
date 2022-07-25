package java12_exception.custom;

public class User {
	private int age; //나이

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		//나이가 0보다 작거나 150보다 큰 경우
		//	-> 정상적이지 않은 상황으로 정의함 -> 예외 상황
		if( age<0 || age>150 ) {
			System.out.println("[ERROR] 0~150 사이로 입력하세요");
			throw new UserAgeException();
		}
		this.age = age;
	}
}
