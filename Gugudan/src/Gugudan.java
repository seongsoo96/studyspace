public class Gugudan {
	public static void main(String[] args) {
		
		// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가합니다
		for(int i=2; i < 10; i++) {
			System.out.println(i + "단을 출력합니다.");
			
			// # 위에서 i의 값이 2라면 2x1 ~ 2x9 까지 진행 합니다.
	        // # 이 반복문(j)이 종료되면 위의 반복문 변수 i가 1 증가하여
	        // 다시 3x1 ~ 3x9 까지 진행하는 식으로 9단까지 반복 합니다
			for(int j=0; j < 10; j++) {
				System.out.println(i + " x " + (j+1) + " = " + i * (j+1));
			}
			System.out.println();
		}
	}
}	
		
//		for(int i=0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		
//		for(int i=0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		int[] times3 = new int[9];
//		for(int i=0; i < times3.length; i++) {
//			times3[i] = 3 * (i + 1);
//		}
//		
//		for(int i=0; i < times3.length; i++) {
//			System.out.println(times3[i]);
//		}
//		
//		int[] times4 = new int[9];
//		for(int i=0; i < times4.length; i++) {
//			times4[i] = 4 * (i + 1);
//		}
//		
//		for(int i=0; i < times4.length; i++) {
//			System.out.println(times4[i]);
//		}
		