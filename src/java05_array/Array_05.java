package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열
		String str = "Apple";
		
		//-----------------------------------------
		
		String[] strArr; //문자열 배열 선언
		strArr = new String[3]; //배열 생성
		
		//배열에 값 대입
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		System.out.println("배열의 길이: " + strArr.length);
		System.out.println("=================================");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println("문자열의 길이: " + strArr[i].length());
			System.out.println("-------------------");
		}
		
	}
}
