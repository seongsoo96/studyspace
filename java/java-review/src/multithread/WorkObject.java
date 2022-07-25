package multithread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadAA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadBB의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		
		}
	}
}
