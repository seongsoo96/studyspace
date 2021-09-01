package day01;
// 논리형 데이터타입
// boolean
// boolean은 딱 2가지 값만 존재한다
// true / false
// 하지만 boolean의 경우 변수를 직접 만들어서 쓰기보다는
// 연산자의 결과 혹은 메소드의 결과를 그대로 쓰는 경우가 많다.
public class Ex07Boolean {
	public static void main(String[] args) {
		boolean myBoolean = true;
		System.out.println("myBoolean의 현재값:" + myBoolean);
		myBoolean = false;
		System.out.println("myBoolean의 현재값:" + myBoolean);
	}

}
