package java09_api;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		
		String data1 = "Hi Hello Hola";
		
		String[] token1 = data1.split(" ");
		//" "를 구분자로 data1을 토큰화한다
		//	-> 결과는 String[]타입으로 반환
		
		for(int i=0; i<token1.length; i++) {
			System.out.println(i + " : " + token1[i]);
		}
		System.out.println("------------------");
		
		String data2 = "I%!am%!iron%!man";
		String[] token2 = data2.split("%!");
		
		for(int i=0; i<token2.length; i++) {
			System.out.println(i + " : " + token2[i]);
		}
		System.out.println("------------------");
		
		String data7 = "A, B, C"; //띄어쓰기 조심
		String[] token7 = data7.split(",");
		
		for(int i=0; i<token7.length; i++) {
			System.out.println(i + " : " + token7[i]);
		}
		
		
		
//		data1 = "Hi Hello Hola";
		
		StringTokenizer st1 = new StringTokenizer(data1); //구분자: 공백문자
		
		System.out.println("토큰의 개수 : " + st1.countTokens());
		
		//토큰이 존재하는 만큼 반복
		while( st1.hasMoreTokens() ) {
			
			//토큰을 반환한다 - 출력
			System.out.println( st1.nextToken() );
		}
		
		//	public boolean hasMoreTokens();
		//		토큰이 존재하면 true반환, 없으면 false반환
		
		//	public String nextToken();
		//		토큰을 반환하고, 다음 토큰을 가리키게 만든다
		
		System.out.println("------------------");
		
//		data2 = "I%!am%!iron%!man";
		
		StringTokenizer st2 = new StringTokenizer(data2, "%!");
		
		System.out.println( st2.nextToken() );
		System.out.println( st2.nextToken() );
		System.out.println( st2.nextToken() );
		System.out.println( st2.nextToken() );
//		System.out.println( st2.nextToken() ); //에러, NoSuchElementException
	}
}
