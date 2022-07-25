package java05_array.quiz2D;

import java.util.Scanner;

public class Q5_1 {
	public static void main(String[] args) {
		final int RIGHT = 1;
		final int DOWN = 2;
		final int LEFT = 3;
		final int UP = 4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int line = sc.nextInt();
		
		int[][] arr = new int[line][line];

		int state = RIGHT; //진행방향

		int i_min=0;
		int i_max=line-1;

		int j_min=0;
		int j_max=line-1;

		int num=1;
		int max = line*line;
		while(num<=max) {
			switch(state) {
			case RIGHT:
				for(int j=j_min; j<=j_max; j++)
					arr[i_min][j] = num++;
				i_min++;
				state = DOWN;
				break;
				
			case DOWN:
				for(int i=i_min; i<=i_max; i++)
					arr[i][j_max] = num++;
				j_max--;
				state = LEFT;
				break;
				
			case LEFT:
				for(int j=j_max; j>=j_min; j--)
					arr[i_max][j] = num++;
				i_max--;
				state = UP;
				break;
				
			case UP:
				for(int i=i_max; i>=i_min; i--)
					arr[i][j_min] = num++;
				j_min++;
				state = RIGHT;
				break;
				
			}
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
