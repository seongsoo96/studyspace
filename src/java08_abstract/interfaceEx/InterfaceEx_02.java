package java08_abstract.interfaceEx;

//** 자바는 다중 상속을 금지하고 있다
//	-> extends키워드로 한 개의 클래스만 상속받을 수 있다

//class P1{
//	public void out() {
//		System.out.println("P1");
//	}
//}
//class P2 {
//	public void out() {
//		System.out.println("P2");
//	}
//}
//class Children extends P1, P2 { //다중 상속
//	
//	@Override
//	public void out() {
//		-> P1, P2 중 어떤 메소드를 상속받아야하는지 정할 수 없음
//	}
//	
//}



public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out(); //자식클래스의 out() 메소드 호출
		
		System.out.println("---------");
		
		Parent p; //부모타입 객체 변수
		p = new Child(); //부모타입 -< 자식타입
		
		p.out(); //자식클래스의 out() 메소드 호출(동적바인딩, 인스턴스 확인)
		
		System.out.println("------------");
		
		//** extends한 클래스는 부모클래스가 된다
		//** implements한 인터페이스도 부모타입이 된다
		
		Inter_01 i01; //인터페이스 객체 변수
		i01 = new Child(); //Child객체 생성, 부모타입 <- 자식타입
		
		i01.out(); //자식클래스의 out() 메소드 호출(동적바인딩, 인스턴스 확인)
		
		System.out.println("------------");
		
		Inter_02 i02 = new Child();
		i02.out();
	}
}
