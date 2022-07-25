package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12912

public class Prog_12912 {

	public static long solution(int a, int b) {
		long answer = 0;

		int leng = Math.abs(a-b) + 1;
		int[] arr = new int[leng];

		for(int i=0; i<arr.length; i++) {
			if(b>a) {
				arr[i] = i+a;
				answer += arr[i];
			} else if(a>b) {
				arr[i] = i+b;
				answer += arr[i];
			} else if (a==b) {
				answer = a;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(5,3));
		System.out.println(solution(3,3));
		System.out.println(solution(1,100));
		System.out.println(solution(100,1));
		System.out.println(solution(7,5));
		System.out.println(solution(3,1));
	}
}
