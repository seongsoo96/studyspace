package day01;
// 비교 연산자
// 비교 연산자는 왼쪽의 갑소가 오른쪽의 값을
// 비교한다.
// > >= < <= == !=
public class Ex10Operator03 {
	public static void main(String[] args) {
		// < 왼쪽 값이 오른쪽 값보다 작으면 true 아니면 false가 나온다.
		System.out.println("3 < 5 : " + (3 < 5));
		System.out.println("5 < 3 : " + (5 < 3));
		System.out.println("3 < 5 : " + (3 < 3));
		
		// > 왼쪽 값이 오른쪽 값보다 크면 true 아니면 false가 나온다.
		System.out.println("3 > 5 : " + (3 > 5));
		System.out.println("5 > 3 : " + (5 > 3));
		System.out.println("3 > 5 : " + (3 > 3));

		// <= 왼쪽 값이 오른쪽 값보다 작거나 같으면 true 아니면 false가 나온다.
		System.out.println("3 <= 5 : " + (3 <= 5));
		System.out.println("5 <= 3 : " + (5 <= 3));
		System.out.println("3 <= 5 : " + (3 <= 3));
		
		// >= 왼쪽 값이 오른쪽 값보다 크거나 같으면 true 아니면 false가 나온다.
		System.out.println("3 >= 5 : " + (3 >= 5));
		System.out.println("5 >= 3 : " + (5 >= 3));
		System.out.println("3 >= 5 : " + (3 >= 3));
		
		// == 은 왼쪽 값과 오른쪽 값이 같으면 true 아니면 false가 나온다.
		System.out.println("3 == 3 : " + (3 == 3));
		System.out.println("3 == 4 : " + (3 == 4));
		
		// != 은 왼쪽 값과 오른쪽 값이 다르면 true 아니면 false가 나온다.
		System.out.println("3 != 3 : " + (3 != 3));
		System.out.println("3 != 4 : " + (3 != 4));
		
		// 단 비교연산자 중 == 과 != 은 참조형 변수에 대해 사용할 경우
		// 정확한 값이 나오지 않을 수도 있다.
		String myString1 = "abc";
		String myString2 = new String("abc");
		String myString3 = myString1;
		
		System.out.println("=========myString 값들 확인하기========");
		System.out.println("myString1의 현재값: " + myString1);
		System.out.println("myString2의 현재값: " + myString2);
		System.out.println("myString3의 현재값: " + myString3);
		System.out.println("====================================");
		
		System.out.println("---비교 연산자를 사용한 참조형 변수값 비교---");
		System.out.println("myString1 == myString2: "+ (myString1 == myString2));
		System.out.println("myString1 == myString3: "+ (myString1 == myString3));
		System.out.println("myString2 == myString3: "+ (myString2 == myString3));
		System.out.println("-------------------------------------");
		
		// 참조형 변수의 경우
		// 해당 공간에는 실제 값이 아닌
		// 실제 값이 들어있는 공간에 대한 주소값이 들어가게 된다.
		
		// 하지만 비교연산자의 경우 그 주소값을 참조하여 실제 값을 확인해서
		// 비교하는 것이 아니라
		// 주소값 자체를 비교하게 된다.
		
		// 따라서 참조형 데이터타입 변수의 값을 비교할 때에는
		// 해당 변수의 equals() 라는 메소드를 실행시켜서 비교해야한다!
		System.out.println("====equals()를 사용한 비교");
		System.out.println("myString1.equals(myString2): " + (myString1.equals(myString2)));
		System.out.println("myString1.equals(myString3): " + (myString1.equals(myString3)));
		System.out.println("myString2.equals(myString3): " + (myString2.equals(myString3)));
	}

}
