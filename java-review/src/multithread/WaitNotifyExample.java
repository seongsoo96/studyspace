package multithread;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadAA threadA = new ThreadAA(sharedObject);
		ThreadBB threadB = new ThreadBB(sharedObject);
		
		threadA.start();
		threadB.start();
	}

}
