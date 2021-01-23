package java04_control.loof;

public class BreakContinue {
	public static void main(String[] args) {
		
		//break;
		//	제어문을 중단시키는 역할을 수행하는 코드
		//	if문은 중단시키지 않는다
		
		//	-> for, while, do-while, switch 를 중단시킴
		//	제어문을 중첩했을 경우 가장 가까운{}블록을 가진
		//	제어문을 한 개만 중단시킨다
		
		for(int i=0; i<100; i++) {	//i, 0~99, x100
			System.out.println(i);
			
			if(i>=5) {
				break;				
			}
		}
		
		System.out.println("-----------------");
		//-----------------------------------------
		
		//continue;
		//	반복문에서 사용하는 기타제어문
		//	다음 반복으로 넘어간다
		
		// for문에서는 증감문으로 넘어간다
		// while문에서는 조건문으로 넘어간다
		// do-while문에서는 조건문으로 넘어간다
		
		for(int i=0; i<10; i++) { //i, 0~9, x10
			if(i%2==0) { //짝수
				continue; //다음 반복으로 넘어가기
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
