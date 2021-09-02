package java09_api;

import java.util.Random;
import java.util.Scanner;

//+ 배스킨라빈스31 게임
//- 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//- 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
// 말할 수 있다
//- 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//- 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//- 31을 말하는 사람이 진다
//
//
//* 추가 사항
//	 31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//	있는 숫자까지만 말한다
//
//	ex. 사용자가 29까지 말했다면
//	  컴퓨터는 무조건 30까지만 말한다

public class Random_BR31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int com=0; //컴퓨터의 수
		int user=0; //사용자의 수
		
		int num=1;
		
		int max = 31;
		
		int winner = 0;
		
		while(num<=max) {
			com = ran.nextInt(3) + 1;
			
			for(int i=0; i<com && num<=max; i++) {
				System.out.println("com : " + num++);
				
				if(num>max)	winner=2;
			}
			
			while(num<=max) {
				System.out.println();
				System.out.print(">> 몇 개의 연속된 숫자를 말하시겠습니까? ");
				user = sc.nextInt();

				if(user<1 || user>3) {
					System.out.println();
					System.out.println(">> 1~3까지만 입력가능합니다. 다시!");
				} else	break;
			}
			
			for(int i=0; i<user && num<=max; i++) {
				System.out.println("user : " + num++);
				if(num>max)	winner=1;
			}
		}
		
		if(winner==1) {
			System.out.println("컴 승리");
		} else if(winner==2) {
			System.out.println("유저 승리");
		}
	}
}
