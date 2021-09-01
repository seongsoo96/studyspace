package day01;
// 할당연산자
// 할당연산자는
// 왼쪽 공간에 오른쪽 값을 할당하는 연산자이다.

// =, +=, -=, /=, %=
public class Ex09Operator02 {
	public static void main(String[] args) {
		// = 은 오른쪽 값을 왼쪽 공간에 할당한다.
		int number = 5;
		System.out.println("number의 현재값:" +number);
		
		// += 은 오른쪽 값을 왼쪽 공간의 현재값에 더한 후에
		// 그 결과값을 왼쪽 공간에 할당한다.
		number += 4;
		System.out.println("number의 현재값:" + number);
		
		// -= 은 오른쪽 값을 왼쪽 공간의 현재값에 뺀 후에
		// 그 결과값을 왼쪽 공간에 할당한다.
		number -= 3;
		System.out.println("number의 현재값:" + number);
		
		// *= 은 오른쪽 값을 왼쪽 공간의 현재값에 곱한 후에
		// 그 결과값을 왼쪽 공간에 할당한다.
		number *= 4;
		System.out.println("number의 현재값:" + number);
		
		// /= 은 오른쪽 값을 왼쪽 공간의 현재값에 나눈 후에
		// 그 결과값을 왼쪽 공간에 할당한다.
		number /= 3;
		System.out.println("number의 현재값:" + number);
		
		// %= 은 오른쪽 값을 왼쪽 공간의 현재값에 나눈 후에
		// 그 결과값을 왼쪽 공간에 할당한다.
		number %= 5;
		System.out.println("number의 현재값:" + number);
	}

}
