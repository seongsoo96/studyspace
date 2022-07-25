package day01;
// 문자형 기본형타입
// char
// char은 character의 줄임말로써
// ASCII 테이블이라는 특수한 표를 사용하여
// 문자를 나타낸다.

// char는 한번에 한 글자만 관리할 수 있다.

public class Ex06Character {
	public static void main(String[] args) {
		//char에 값을 넣을때는 2가지 방법이 가능하다
		//1. 실제 글자를 ''으로 감싸서 넣는 방법
		char myChar = 'a';
		System.out.println("myChar의 현재값:" + myChar);
		
		//2. 코드값을 넣는 방법
		myChar = 66;
		System.out.println("myChar의 현재값:" + myChar);
		
		// char의 단점:
		// 한번에 한 글자만 사용가능하다.
		// 따라서 여러 글자를 다루어야 할 때에는
		// String 클래스 변수를 사용해야 한다.
		
		// String에 값을 넣을 때에는
		// ""로 감싸진 글자들을 넣어주면 된다.
		String myString = new String();
		myString = "abcdefg";
		System.out.println("myString의 현재값:" + myString);
	}
	
	
}
