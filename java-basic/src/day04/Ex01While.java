package day04;
// 반복문 02 - while
// 횟수가 명확하게 몇번 반복하라는 for 반복문과는 다르게
// while은 조건식이 true인 동안 
// 계속 반복하게 된다.

// while은 다음과 같은 구조를 가진다.
// while(조건식){
//    조건식이 true인 동안 반복할 코드
// }
public class Ex01While {
	public static void main(String[] args) {
		//for(int i = 0; i < 3; i++){
		//   System.out.println("i의 현재값: "+i);
		//}
		//를 while로 쓰면 다음과 같다.
		
		int i = 0;
		while(i < 3) {
			System.out.println("i의 현재값: "+i);
			i++;
		}
		
		
	}
}









