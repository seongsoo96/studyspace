package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {
		
		//Iterator, 반복자
		//	컬렉션의 모든 요소들을 순차적으로 반복할 때 사용한다
		
		//	컬렉션의 요소를 반복적으로 처리하는 방법을
		//	표준화시키기위해 나온 것
		
		//-------------------------------------------------------
		
		//Arrays.asList() 메소드
		//	-> 매개변수로 전달된 데이터를 이용해서 ArrayList를 생성한다
		//	-> ArrayList의 선언과 동시에 초기화같은 기능을 한다
		List list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println( list );
		
		//-------------------------------------------------------
		
		Iterator iter; //반복자 변수
		
		iter =list.iterator();	//리스트의 Iterator 객체 생성
		
		//Iterator의 주요 메소드
		//	public boolean hasNext();
		//		다음 요소가 존재하는지 확인(true/false)
		
		//	public E next();
		//		다음 요소의 데이터를 반환
		
		//요소가 존재하는만큼 하나씩 반복한다
		while( iter.hasNext() ) {
			
			//요소를 반환하고 다음 요소를 참조한다
			System.out.println( iter.next() );
		}
		
	}
}
