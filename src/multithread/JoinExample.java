package multithread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		// sumThread가 종료할 때까지 메인 스레드를 일시정지시킴
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}
