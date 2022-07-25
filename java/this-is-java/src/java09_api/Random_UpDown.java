package java09_api;

//+ UP&DOWN 게임
//- 컴퓨터가 1~50의 랜덤을 생성한다 (= com)
//
//- 사용자의 입력을 받는다 (= user)
//
//- user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
// (기준은 com)
// (ex. com == 40 && user == 30 -> UP )
// 
//- user가 com과 같으면 user 승리
//
//- 7번안에 맞추지 못하면 com 승리

import java.util.Random;
import java.util.Scanner;

public class Random_UpDown {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
//		int com= ran.nextInt(50) + 1;
//		System.out.println(com);
//		
//		boolean isWin = false;
//		
//		
//		for(int i=0; i<7; i++) {
//			System.out.print("1~50까지 입력 >> ");
//			int user = sc.nextInt();
//			
//			if(com==user) {
//				System.out.println("승");
//				isWin = true;
//				break;
//			} else if(user<com) {
//				System.out.println("UP");
//			} else {
//				System.out.println("Down");
//			}
//		}
//		
//		if(isWin == false) {
//			System.out.println("컴 승");
//		}
		
		// 강사님 코드
		
		int com; //컴퓨터의 수
		int user; //사용자의 수
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();

		System.out.println("=============START=============");
		com = ran.nextInt(50)+1; //컴퓨터 랜덤 생성

		for(int j=0; j<7; j++) { //7번 반복
			//사용자의 선택
			while(true) {
				System.out.print("1~50 중 하나 입력 : ");
				user = sc.nextInt();
				
				if (1<=user && user<=50)
					break;
				else
					System.out.println("1~50 !!");
				
			}
			
			if(user==com) {
				System.out.println("이겼습니다.");
				return;
			} else if(user>com) {
				System.out.println("Down");
			} else if(user < com) {
				System.out.println("Up");
			}
		}

		System.out.println("졌네. 컴퓨터는 "+com+" 이라네 \n");
		
		
		
	}
}
