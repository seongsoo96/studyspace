package java02_operator;

public class LogicalTest_01 {

	public static void main(String[] args) {
		
		int a=5, b=6, c=10, d;
		
		d = ++a * b--;
		System.out.println("a=" + a + ",b=" + b + ",d=" + d);
		
		d = a++ + ++c - b--;
		System.out.println(("a=" + a + ",b=" + b + ",c=" + c + ",d=" + d));
		
		// + 연산자
		//		1. 덧셈 - 이항 연산
		//		2. 문자열 연결 -이항 연산
		//			"Hello" + 100 -> "Hello100"
		//			"age=" + 29 -> "age=29"
		//			30 + "cm" -> "30cm"
		
		
		
		
	}

}
