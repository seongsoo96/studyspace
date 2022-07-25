package java06_class.method;

import java.util.Arrays;

public class MethodEx {
	public static void main(String[] args) {
		
		System.out.println("--------- Method_01 ----------");
		Method_01 m01 = new Method_01();
		
		int result = m01.add(3, 5); //메소드 호출
		
		System.out.println("덧셈의 결과 : " + result);
		System.out.println("덧셈의 결과 : " + m01.add(333, 444));
		
		
		System.out.println("------------------------------");
		System.out.println("--------- Method_02 ----------");
		
		Method_02 m02 = new Method_02();
		
		m02.method1(); // 메소드 호출
		
		m02.method2(123);
		//전달하는 데이터 - 전달인자, 전달인수, 인자, 인수
		//	argument
		
		System.out.println("반환값 : " + m02.returnNum() );
		
		System.out.println(("덧셈 결과 : " + m02.plus(100, 200)));
		
		
		System.out.println("------------------------------");
		System.out.println("--------- Method_03 ----------");
		
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5]; //int형 배열
		arr[2] = 100;
		
		System.out.println( Arrays.toString(arr) ); //배열 전체 출력
		
		m03.arrayTest(arr); //배열을 매개변수로 전달
		
		System.out.println( Arrays.toString(arr) ); //배열 전체 출력
		
		System.out.println("--- 기본형 전달 테스트 ---");
		
		int num = 888;
		
		System.out.println("전 : " + num);
		
		m03.primitiveTest(num);
		
		System.out.println("후 : " + num);
		
		
		System.out.println("------------------------------");
		System.out.println("--------- Method_04 ----------");
		
		Method_04 m04 = new Method_04();
		
		m04.returnTest01();
		
		m04.returnTest02(-1);
		
	}
}
