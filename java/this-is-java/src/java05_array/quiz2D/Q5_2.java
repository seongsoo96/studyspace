package java05_array.quiz2D;

import java.util.Scanner;

public class Q5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int line = sc.nextInt();
		
		int[][] arr = new int[line][line];

		int cnt = 0;
		
		int row = 0;
		int col = -1;
		
		int direct = 1;
		
		int num=1; 
		int max = line*line;
		
		while(num<=max) {
			
			//가로 방향 채우기
			for(int i=0; i<line-cnt; i++) {
				col += direct; //방향에 맞춰 열 idx 조절
				arr[row][col] = num++;
			}
			
			//세로 방향 채우기
			for(int i=0; i<line-1-cnt; i++) {
				row += direct; //방향에 맞춰 행 idx 조절
				arr[row][col] = num++;
			}
			
			cnt++; //채워지는 개수 조절
			direct *= -1; //채워지는 방향 조절
		}
		
		//최종 출력
		for(int i=0; i<line; i++) {		
			for(int j=0; j<line; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
