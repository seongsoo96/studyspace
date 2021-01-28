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
		
		int com= ran.nextInt(50) + 1;
		System.out.println(com);
		
		boolean isWin = false;
		
		
		for(int i=0; i<7; i++) {
			System.out.print("1~50까지 입력 >> ");
			int user = sc.nextInt();
			
			if(com==user) {
				System.out.println("승");
				isWin = true;
				break;
			} else if(user<com) {
				System.out.println("UP");
			} else {
				System.out.println("Down");
			}
		}
		
		if(isWin == false) {
			System.out.println("컴 승");
		}
			
		
		
		
	}
}
