package java08_abstract.interfaceEx;

public class Child extends Parent implements Inter_01, Inter_02 {
	
	@Override
	public void out() {
		System.out.println("자식클래스");
	}
}
