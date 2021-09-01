package day02;
// 자바 콘솔에 출력하는 3가지 방법
// 자바 콘솔에 출력하는 것은
// System.out 안의
// print(), println(), printf() 3가지 메소드가 담당한다.

// print(): ()안의 내용을 출력하고, 그 다음 출력위치는 바로 오른쪽 칸이 된다.
// println(): print a line의 줄임말로써 ()의 내용을 출력하고, 그 다음 
//            출력위치는 다음 줄의 첫칸이 된다.
// printf() : print in format의 줄임말로써 ()의 내용을 "형식에" 맞추어 출력하고
//			  그 다음 출력위치는 바로 오른쪽 칸이 된다.

// 공백문자
// 공백문자란 단순히 스페이스 만이 아니라
// 탭 공백, 개행 문자 등의 공백을 뜻하는 문자이다.
// 주로 \+알파벳으로 이루어진다.
// 탭 공백은 스페이스 4칸 크기로써 \t를 쓰면 탭공백이 들어간다.
// 개행 문자는 다음 출력위치를 다음 줄로 바꾸는데 \n을 쓰면 된다.

public class Ex01Print {

	public static void main(String[] args) {
		// 1.print()
		String myString = new String("abcDEF");
		System.out.print(myString);
		System.out.print(myString);
		// 2.println()
		System.out.println(myString);
		System.out.println(myString);
		// 3.printf()
		System.out.printf("%s", myString);
		System.out.printf("%s", myString);
		
		System.out.println();
		//위의 System.out.println()은 System.out.print("\n")과
		//똑같은 의미이다.
		
		// 탭 공백
		System.out.println("abc\tDEF");
		// 개행 문자
		System.out.println("abc\nDEF");
	}

}
