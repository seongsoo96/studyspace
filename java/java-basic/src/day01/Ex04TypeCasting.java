package day01;
// 형변환(typecasting)
// 형변환이란, 특정 값을 다른 데이터타입으로 변환하는 것을
// 형변환이라고 한다.

// 형변환에는 2가지 종류가 있다.
// 1. 암시적 형변환(implicit typecasting)
//	  암시적 형변환은 더 작은 데이터타입의 값을 더 큰 데이터타입으로 바꿀 때 발생한다.
//	  우리가 특별히 아무런 명령어를 적어주지 않아도
//	  자동으로 형변환이 발생된다.

// 2. 명시적 형변환(explicit typecasting)
//	  명시적 형변환은 더 큰 데이터타입의 값을 더 작은 데이터타입으로 바꿀 때 발생한다.
//	  바꿀 값 앞에 (바꿀 데이터타입)을 적어주어야한다.

public class Ex04TypeCasting {
	public static void main(String[] args) {
		int myInt = 30;
		byte myByte = 20;
		System.out.println("myInt의 현재값:" +  myInt);
		System.out.println("myByte의 현재값:" +  myByte);
		
		// 암시적 형변환을 해보자
		System.out.println("byte의 값을 int로 바꾸는 암시적 형변환");
		myInt = myByte;
		System.out.println("myInt의 현재값:" + myInt);
		System.out.println("myByte의 현재값:" + myByte);
		
		// 명시적 형변환을 해보자
		System.out.println("int의 값을 byte로 바꾸는 암시적 형변환");
		// 아래코드는 더 작은 데이터타입인 myByte에
		// 더 큰 데이터타입인 myInt의 값을 넣으려고 했으므로
		// 에러발생
		// myByte = myInt;
		
		// 명시적 형변환 하는 방법
		// 변수 = (바꿀 타입)값;
		myByte = (byte)myInt;
		System.out.println("myInt의 현재값:" + myInt);
		System.out.println("myByte의 현재값:" + myByte);
		
		// 단 명시적 형변환을 할때 한가지 주의할 점이 있다.
		// 만약 기본형 데이터타입에 대해 명시적 형변환을 할 경우에는
		// 범위를 벗어나면 버그가 발생한다.
		
		// 만약 참조형 데이터타입에 대해 명시적 형변환을 할 경우에는
		// 만약 불가능한 형변환일 경우 에러가 난다.
		
		// 기본형 데이터타입의 경우
		// 최대값을 넘어선 값을 명시적 형변환을 하게 되면
		// overflow라는 버그가 발생한다.
		
		// byte의 최대값: 127
		// 그렇다면 128을 byte에 넣으면 어떻게 될까?
		myByte = (byte)127;
		System.out.println("overflow 발생 전의 byte의 현재값:" + myByte);
		
		myByte = (byte)128;
		System.out.println("overflow 발생 후의 byte의 현재값:" + myByte);
		
		myByte = (byte)129;
		System.out.println("overflow 발생 후의 byte의 현재값:" + myByte);
		
		// 최소값을 넘어선 값을 명시적 형변환을 하게 되면
		// underflow라는 버그가 발생한다.
	
		// byte의 최소값: -128
		myByte = -128;
		System.out.println("underflow 발생 전의 byte의 현재값:" + myByte);
		myByte = (byte)-138;
		System.out.println("underflow 발생 후의 byte의 현재값:" + myByte);
	
	}
}
