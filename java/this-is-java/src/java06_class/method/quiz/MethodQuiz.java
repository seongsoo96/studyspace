package java06_class.method.quiz;

public class MethodQuiz {
	
	public void print100() {
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
	}
	
	public void printHello(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Hello");
		}
	}
	
	public void printText(int cnt, String text) {
		for(int i=0; i<cnt; i++) {
			System.out.println(text);
		}
	}
}
