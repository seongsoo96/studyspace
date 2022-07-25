package java09_api;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[6];
		
		//전체 6개 랜덤 생성하기 - 로또 숫자 만들기
		for(int i=0; i<arr.length; i++) {
			
			int num = ran.nextInt(45)+1; //1~45

			//이미 들어있는 값 중에 중복값이 있으면 다시 랜덤 추출 필요
			boolean isExists = false; //중복값 변수(false: 없음, true: 있음)
			
			//생성한 랜덤수들 중에 존재하는 값인지 검사
			for(int j=0; j<i; j++) {
				
				if(arr[j] == num) { //존재하는 값일 경우
					isExists = true; //중복값이라고 표시해두기
					break; //중단
				}
			}
			
			if( isExists ) {
				//존재하는 값이라고 밝혀지면 값 넣지 않고
				//반복횟수 한번 추가
				i--;
				continue;
			}
			
			//존재하지 않는 값이면 정상적으로 배열에 삽입
			arr[i] = num;
		}
		
		System.out.println( Arrays.toString(arr) );
		
		Arrays.sort(arr); //배열 정렬
		
		System.out.println( Arrays.toString(arr) );
	}
}