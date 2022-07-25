package java04_control.loof;

public class For_06 {
	public static void main(String[] args) {
		//구구단 2단을 출력하기
		
		//반복횟수: 9번
		//반복구간: 1~9
		
		//초기식: int i=1;	(시작값)
		//조건식: i<=9;		(끝값)
		//증감식: i++
		
		for(int i=1; i<10; i++) {
			System.out.println("2 x " + i + " = " + 2*i);
		}
	}
}
