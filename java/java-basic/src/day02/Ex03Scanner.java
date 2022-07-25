package day02;

// Scanner
// Scanner란 자바가 기본적으로 제공해주는 클래스로서
// 다양한 입력을 담당한다.
// 단, Scanner는 우리 패키지 안에 존재하지 않으므로
// import 라는 명령어를 통해서
// 어디에 있는 Scanner 클래스를 가지고 올지를 지정해주어야 한다.
import java.util.Scanner;

public class Ex03Scanner {

	public static void main(String[] args) {
		// Scanner는 참조형 데이터타입이므로
		// 아래와 같은 방식으로 변수를 만들어준다.
		Scanner scanner = new Scanner(System.in);
		
		int number;

		// 스캐너를 사용하여 정수를 입력받을 때에는
		// nextInt() 메소드를 호출하면 된다.
		System.out.print("정수: ");
		number = scanner.nextInt();
		System.out.println("사용자가 입력한 정수: " + number);

		// 스캐너를 사용하여 실수를 입력받을 때에는
		// nextDouble() 메소드를 호출하면 된다.
		System.out.print("실수: ");
		double myDouble = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수: " + myDouble);

		// 스캐너를 사용하여 스트링을 입력받을 때에는
		// nextLine() 메소드를 호출하면 된다.

		// nextLine() 메소드를 사용할 때 한가지 주의할 점이 있는데
		// nextInt(), nextDouble() 등의
		// 숫자를 입력하는 메소드를 호출한 후에는
		// 우리가 숫자를 입력하면서 입력이 끝났다를 알려주는 엔터키가
		// 버퍼메모리에 그대로 남아있다.
		// 따라서 숫자 입력 후에 nextLine()을 사용하면
		// 스캐너는 "사용자가 아무런 입력없이 입력을 종료시켰구나!" 라고
		// 착각하게 된다.
		// 따라서 버퍼메모리를 한번 비워주어야
		// 정상적으로 숫자 입력 후에 스트링 입력이 가능하다.
		// 버퍼메모리를 비워주기 위해서는 아래의 한줄을 실행시키면 된다.
		scanner.nextLine();
		
		// 하지만 버퍼메모리가 아무것도 없는 경우,
		// 즉 scanner.nextLine()이 실행된 직후나
		// 숫자 입력을 받기 전이라면
		// 버퍼메모리를 비워줄 필요가 없고
		// 오히려 scanner.nextLine()만 적어주면
		// 우리가 추가적으로 무언가 입력을 해야한다.

		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.println("사용자가 입력한 이름: " + name);

		// 스캐너 변수와 같이
		// 외부 '메모리'를 참조하는 변수는
		// 항상 프로그램 가장 마지막줄에
		// close() 메소드를 호출해주면 좋다.
		scanner.close();

	}

}
