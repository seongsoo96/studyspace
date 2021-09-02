package java05_array.array2D;

import java.util.Scanner;

public class Array2D_07 {
	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		
		//1~3학년
		//2개반
		//4명의 학생
		//3과목
		//점수
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		//------------------------------------------
		
		//2명의 국어, 영어, 수학 점수를 저장하는 배열
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //학생들의 총점 배열
		double[] avg = new double[2]; //학생들의 평균 배열
		
		//-------- 2명 학생들의 3과목 점수 입력받기 ------
		Scanner sc = new Scanner(System.in); //입력객체

		String[] subject = { "국어", "영어", "수학" };
		
		for(int i=0; i<sco.length; i++) { //i번째 학생, 0~1, x2
			
			for(int j=0; j<sco[i].length; j++) { //j번째 과목 점수, 0~2, x3
				System.out.print( (i+1) + "번 학생의 " + subject[j]  + "점수 입력 : " );
				sco[i][j] = sc.nextInt();
			}
			System.out.println("-----------------");
		}
		//------------------------------------------
		
		//TEST - 점수 입력 테스트
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(sco[i][j] + " "); 
//			}
//			System.out.println();
//		}
		//------------------------------------------
		
		//-------- 총점 구하기 ------
		for(int i=0; i<2; i++) { //i번째 학생
			for(int j=0; j<3; j++) { //j번째 과목
				sum[i] += sco[i][j]; //총점 계산
			}
		}
//		System.out.println(sum[0]);
//		System.out.println(sum[1]);
		//---------------------------
		
		//-------- 평균 구하기 ------
		for(int i=0; i<2; i++) { //i번째 학생
			avg[i] = sum[i]/(double)subject.length;
		}
//		System.out.println(avg[0]);
//		System.out.println(avg[1]);
		//---------------------------
		
		//-------- 종합 출력 --------
		//ex)	번호	국어	영어 	수학 	총점	평균
		//		1번		xxx		xxx		xxx		xxx		xxx.xx
		//		2번		xxx		xxx		xxx		xxx		xxx.xx
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");
		
		for(int i=0; i<2; i++) {
			System.out.print(i+1 + "번\t");
			
			for(int j=0; j<3; j++) {
				System.out.print(sco[i][j] + "\t");
			}
			
			System.out.println(sum[i] + "\t" + Math.round(avg[i]*100)/(double)100);
		}
		//---------------------------
	}
}
