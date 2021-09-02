package java10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_01_List {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); //빈(empty) 리스트
		
		System.out.println("---- 삽입 ----");
		
		list.add("Apple");	//[0]
		list.add("Banana");	//[1]
		list.add("Cherry");	//[2]
		
		System.out.println( list );
		
		
		System.out.println("\n---- 조회 ----");
		
		System.out.println("1번째 요소 : " + list.get(1));
		
		//size() : 리스트의 크기를 반환
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		System.out.println("\n---- 수정 ----");
		list.set(0, "Orange");
		System.out.println( list );
		
		System.out.println("\n---- 삭제 ----");
		list.remove(1);
		System.out.println( list );
		
		list.remove("Cherry");	//"Cherry" 찾아서 요소 삭제
		System.out.println( list );
		
		//--------------------------------------------------
		
		//자료구조에서 자주 사용되는 동작
		//	CRUD작업
		
		//	Create	-	추가/삽입/생성
		//	Read	-	조회/탐색
		//	Update	-	수정/변경
		//	Delete	-	삭제/제거
		
		//--------------------------------------------------
		
		System.out.println("\n---- isEmpty ----");
		//	-> 	리스트가 비어있는지 확인
		System.out.println( list.isEmpty() ); //false
		
		ArrayList l1 = null; //리스트 생성하지 않았음
		ArrayList l2 = new ArrayList(); //리스트 생성, 비어있음
		
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		
		//	l1 == null (true)
		//	l1.isEmpty(); (에러발생, NullPointerException)
		
		//	l2 == null (false)
		//	l2.isEmpty(); (true)
		
		
		
		System.out.println("\n---- claer ----");
		//	리스트의 모든 요소를 제거
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		
		System.out.println("\n----------------");
		
		list.add("문자열");
		list.add(123);
		list.add(45.234);
		list.add('A');
		list.add(true);
		
		System.out.println( list );
		
		
		
		System.out.println("\n----------------");
		
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		Vector list3 = new Vector();
		
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Apple");
		
		
		//interface List를 상속받은
		//	class ArrayList,
		//	class LinkedList,
		//	class Vector
		//세가지 클래스는 비슷한 기능을 하고 메소드도 같은 걸 사용한다
	//ㄴsd
		
		
	}
}
















