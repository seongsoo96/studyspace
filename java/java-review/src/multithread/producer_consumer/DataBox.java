package multithread.producer_consumer;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("Consumer가 읽은 데이터: " + returnValue);
		data = null;
		notify();
		return data;
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}
}
