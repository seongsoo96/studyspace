package multithread;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		
		for(long i=0; i<1000000000; i++) {}
	}
}
