package java11_generic;

class Class02_1 {
	private int data;
	
	public int display(int data) {
		this.data = data;
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class Class02_2 {
	private double data;
	
	public double display(double data) {
		this.data = data;
		return data;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
}

class Class02<T> {
	private T data;

	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}





public class Generic_02_GenericClass {
	public static void main(String[] args) {
		Class02<String> c1; //T -> String
		c1 = new Class02<>();
		
		c1.setData("Apple");
		
		String fruit = c1.getData();
		
		System.out.println(fruit);
	}
}
