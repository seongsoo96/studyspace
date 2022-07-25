package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		
		//소수점 셋째자리에서 반올림하여 출력
		
		//방법1.
		//	System.out.printf() 를 사용한다.
		//	printf - print formatted
		
		//	서식문자를 이용하여 출력되는 문자열의 서식을 지정한다.
		//	서식문자는 % 기호와 서식을 나타내는 문자를 합쳐서 사용한다.
		//	%d(10진수 정수) %f(실수) %s(문자열) %c(단일문자)
		
		System.out.printf("%d", 123); //서식문자 %d 자리에 123이 들어가서 출력됨.
		System.out.println();
		
		//5글자가 들어갈 자리를 확보하고 데이터 123을 그 자리에 넣어서 출력한다.
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5s%5s%5s", "kor", "eng", "math");
		System.out.println();
		System.out.printf("%5s%5s%5s", 100, 99, 98);
		System.out.println();
		
		//소수점 둘째자리까지 출력되도록 한다 - %.2f
		System.out.printf("%.2f", 123.5456);
		System.out.println();
		
		//단일 문자
		System.out.printf("%c", 'A');
		System.out.println();
		
		//-------------------------------------------------------
		
		//방법2.
		//	String.format("서식문자포함문자열", 데이터, ...)
		//	결과 문자열을 리턴한다.
		
		String str = String.format("%7.2f", 123.45678);
		
		System.out.println("1234567890");
		System.out.println(str);
		
		//방법3.
		//	수학적 계산으로 소수점이하 자리수 유지하기
		
		//	123.4567 
		//		-- x100 --> 12345.67 
		//		-- 소수부분 반올림 --> 12346
		//		-- /100 --> 123.46
		
		double avg = 34.56789;
		
		double result = Math.round( avg*100 ) / (double)100;
		System.out.println(result);
		
		//** Math.round(실수)
		//	주어진 실수의 소수부분을 반올림해서 반환한다.
		
		//	avg						-> 34.56789
		//	avg*100					-> 3456.789
		//	Math.round( avg*100 )   -> 3457
		// Math.round( avg*100 ) / (double)100 -> 34.57
		
		String dStr = "123.46";
		double dVal = Double.valueOf( dStr );
		
		double average = 56.7891124;
		String s = String.format("%.2f", average);
		double res = Double.valueOf(s);
	}
}


















