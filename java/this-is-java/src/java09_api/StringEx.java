package java09_api;

public class StringEx {
	public static void main(String[] args) {
		
		String str1 = "Apple";	//리터럴 상수 "Apple"의 참조값 저장
		String str2 = new String("Banana");	//동적 생성된 "Banana" 참조값 저장
		
		System.out.println("----- length() -----");
		System.out.println("str1의 길이 : " + str1.length());//5
		System.out.println("str2의 길이 : " + str2.length());//6
		
		System.out.println("Cherry의 길이 : " + "Cherry".length());//6
		
		System.out.println("\n----- equals() -----");
		System.out.println("str1과 str2 비교 : " + str1.equals(str2));//false
		
		System.out.println("Banana와 str2 비교 : " + "Banana".equals(str2));//true
		
		System.out.println("Banana == str2 : " + ("Banana" == str2));//false
		
		//문자열 비교할 때에는 동등비교를 해야한다
		//	-> equals() 사용
		//	== 연산자를 이용하여 동일비교를 하면 잘못된 결과가 나올 수 있다
		
		System.out.println("\n----- toLowerCase() -----");
		//문자열의 모든 알파벳을 소문자로 변경한 결과를 반환
		
		String lower = str1.toLowerCase();
		
		System.out.println("str1: " + str1);
		System.out.println("lower: " + lower);
		
		
		
		System.out.println("\n----- toUpperCase() -----");
		//문자열의 모든 알파벳을 대문자로 변경한 결과를 반환
		
		String upper = str1.toUpperCase();
		
		System.out.println("str1: " + str1);
		System.out.println("upper: " + upper);
		
		
		
		System.out.println("\n----- charAt() -----");
		//문자열의 특정 인덱스의 문자(char)를 반환
		
		char ch = "Hello Java".charAt(6); //6번째 인덱스 -> 7번째 문자
		System.out.println( ch );
		
		
		
		System.out.println("\n----- concat() -----");
		//문자열과 문자열을 연결하여 반환한다
		
		String concat = str1.concat(", HIHIHI");
		
		System.out.println("str1: " + str1);
		System.out.println("concat: " + concat);
		
		
		
		System.out.println("\n----- replace() -----");
		//지정한 문자(char)를 다른 문자(char)로 변환하여 반환
		
		String replace1 = str1.replace('A', 'a');
		System.out.println("str1: " + str1);
		System.out.println("replace1: " + replace1);
		
		//바꾸려는 문자가 여러개면 모두 변환
		String replace2 = str1.replace('p', 'T');
		System.out.println("str1: " + str1);
		System.out.println("replace2: " + replace2);
		
		
		System.out.println("\n----- replace() -----");
		//지정한 문자열(CharSequence)을 다른 문자열(CharSequence)로 변환
		//	-> String은 interface CharSequence의 자식클래스
		
		String replace3 = str1.replace("ple", "PLE");
		System.out.println("str1: " + str1);
		System.out.println("replace3: " + replace3);
		
		
		
		System.out.println("\n----- contains() -----");
		//특정 문자열을 포함하고 있는지 검사
		
		boolean res1 = "Hello Java, Welcome".contains("Java");
		System.out.println(res1); //true
		
		boolean res2 = str1.contains("PP");
		System.out.println(res2); //false
 		
		
		
		System.out.println("\n----- subString() -----");
		//문자열의 일부분을 발췌하여 반환
		
		String substr = str1.substring(2); //2번째 인덱스부터 끝까지
		System.out.println(substr);
		
		//1번째(포함) - 3번째(미포함) 인덱스 반환
		String substr2 = str1.substring(1, 3); //1번째~3번째 인덱스 반환
		System.out.println(substr2);
		
		
		
		
		
	}
}
