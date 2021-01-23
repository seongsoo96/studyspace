package java04_control.loopQuiz;

public class Q3 {
	public static void main(String[] args) {
//		1에서 1000까지의 정수중에서 4로 나누어도
//		6으로 나누어도 나머지가 1인 수의 합을 출력하라.
//			> 41916
		int sum = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}