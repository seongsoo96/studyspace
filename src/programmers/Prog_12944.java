package programmers;

public class Prog_12944 {

	public static double solution(int[] arr) {
		double answer = 0;
		int sum = 0;

		for(int i=0; i<arr.length; i++){
			// 모든 배열 원소들의 합
			sum += arr[i];

			// 평균s
			answer = sum / (double)arr.length;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr;
		arr = new int[] {1, 2, 3, 4};
		System.out.println(solution(arr));
		arr = new int[] {5, 5};
		System.out.println(solution(arr));
		arr = new int[] {3, 5, 6, 12};
		System.out.println(solution(arr));
		
	}

}
