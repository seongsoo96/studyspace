package java11_generic;

import java.util.ArrayList;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		
		//public class ArrayList<E>
		
		//	-> 클래스를 정의하며 적어놓은 <E>를 제네릭이라고 한다
		
		//---------------------------------------------------------
		
		//제네릭을 특정 데이터타입으로 결정하면서 코드를 사용할 수 있다
		//	-> 타입 파라미터(제네릭의 타입을 결정하는 것)
		
		//타입파라미터를 결정하지 않음
		//	->	자동으로 Object로 결정됨
		ArrayList list1 = new ArrayList();
		
		//타입파라미터를 String타입으로 결정함
		ArrayList<String> list2 = new ArrayList<String>();
		
		//타입파라미터가 Object로 결정되었기 때문에 어떤 타입이든지 사용가능
		
		list1.add(123);
		list1.add("Apple");
		list1.add(true);
		
		//---------------------------------------------------------
		
		//타입파라미터가 String으로 결정되었기 때문에 String만 사용가능
		
//		list2.add(123);	//에러
		list2.add("Apple");
		list2.add("Apple");
		
		//---------------------------------------------------------
		
		//타입파라미터는 기본데이터타입으로 설정할 수 없다
		//	-> Wrapper클래스 사용해야한다
		
//		Array<int> list3;	//에러
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		list3.add(123);	//오토박싱, 사용할 때에는 int타입을 써도 된다
		
		//---------------------------------------------------------
		
		//객체를 생성하는 코드에서는 타입파라미터를 생략할 수 있다
		//	-> JDK 1.7부터 가능
		
//		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list4 = new ArrayList<>();
		
		//---------------------------------------------------------
		
		//타입파라미터를 String으로 결정
		ArrayList<String> list5 = new ArrayList<>();
		
		//String만 사용할 수 있도록 막는다
//		list5.add(123); //에러
//		list5.add(3.14); //에러
		
		list5.add("안녕");
		
		String data = list5.get(0);
		
		//타입파라미터를 특정 데이터타입으로 결정하면
		//타입 안정성이 제공된다
		
		//** 타입 안정성, Type Safety
		//	객체 또는 메소드가 의도하지 않은 데이터타입으로
		//	사용되는 상황을 방지하는 특성
		
		//	프로그램이 개발자가 의도한 데이터타입만 사용하도록 제한한다
		
		//---------------------------------------------------------
		
		//타입파라미터를 결정하지 않음 - 타입 안정성이 없는 상황
		ArrayList list6 = new ArrayList(); //타입파라미터 -> Object
		
		list6.add("HI");
		list6.add("Hello");
		list6.add("Hola");
		
//		String str = list6.get(0); //에러, Object타입으로 반환함
		String str = (String)list6.get(0); //형변환이 필요하다
		
		
		
		
	}
}
