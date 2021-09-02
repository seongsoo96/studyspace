package java06_class.method.quiz;

public class MethodArrayQuiz {
	
	public void mul10(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 10;
		}
	}
	
	public void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println( "arr[" + i +"] = " + arr[i]);
		}
	}
	
}
