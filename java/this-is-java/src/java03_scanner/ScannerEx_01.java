package java03_scanner;

//java.util.Scanner를 패키지를 제외하고 Scanner라고 사용하겠다는 선언
import java.util.Scanner;
//자바의 클래스(class)
//	자바 프로그램을 구성하는 단위
//	-> 객체지향프로그래밍에서 자세히 다룸


public class ScannerEx_01 {
	public static void main(String[] args) {
		
		//스캐너 클래스
		//	class Scanner
		//	키보드로 입력한 내용을 받아주는 기능
		
		//-----------------------
		int num; //변수 선언
		num = 123; //변수값 대입
		//-----------------------
		
		//클래스를 사용할 때에는 패키지까지 포함해서 명시해야한다
		//패키지는 클래스들을 모아놓는 저장소같은 역할을 한다
		
		//-----------------------
		
		//패키지를 포함한 클래스의 풀네임을 사용
//		java.util.Scanner input; //Scanner 참조형 변수 선언, Scanner객체 변수
		
		//-----------------------
		
		//참조형 객체 사용 방법
		//	[클래스명][변수명] = new [클래스명]([필요한 데이터]);\
		
		Scanner input; //입력 객체 변수 선언
		input = new Scanner(System.in); //
		
		//-----------------------
		
		// .
		//	참조 연산자
		//	참조형 변수의 기능을 참조하여 사용할 수 있게해준다.
		
		int data; //정수형 변수 선언
		data = input.nextInt(); //정수값을 키보드로부터 입력받아 data에 대입
		
		System.out.println("입력한 값 : " + data);
		
		
	}
}
