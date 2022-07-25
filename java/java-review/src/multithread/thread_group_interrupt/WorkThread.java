package multithread.thread_group_interrupt;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("실행중");
			} catch (Exception e) {
				System.out.println(getName() + " interrupted");
				break;
			}
			
		}
		System.out.println("종료됨");
	}
}
