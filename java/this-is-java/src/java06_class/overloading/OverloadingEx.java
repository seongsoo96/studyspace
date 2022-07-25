package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		System.out.println("--- display() ---");
		ol.display();
		
		System.out.println("--- display(11, 22) ---");
		ol.display(11, 22);
		
		System.out.println("--- display() ---");
		ol.display(11, 22);
	}
	
}
