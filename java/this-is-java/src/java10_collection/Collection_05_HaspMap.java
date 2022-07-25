package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_HaspMap {
	public static void main(String[] args) {
		
		Map map = new HashMap();
//		Map map = new Hashtable(); //동기화처리됨
		
		//데이터 삽입
		map.put("a", "Apple");
		map.put(2, "Banana");
		map.put("C", "Cerry");
		
		System.out.println("map : " + map);
		
		System.out.println("\n---- get(key) ----");
		System.out.println( map.get("C") ); // "C"="Cherry"
		
		
		
		System.out.println("\n---- put(key, value) ----");
		map.put(true, "Durian");
		System.out.println("map : " + map);

		System.out.println("------------");
		map.put(2, "Orange");	//기본에 존재하는 Key에 매핑, Value가 바뀜
		System.out.println("map : " + map);
		
		System.out.println("------------");
		map.put(1, "Apple");	//Key는 없지만 Value는 존재하는 값, 상관없음
		System.out.println("map : " + map);
		
		
		
		System.out.println("\n---- contains ----");
		System.out.println("Key 5 : " + map.containsKey(5));
		//Key 5가 없는 경우 데이터 삽입하기
		if( !map.containsKey(5) ) {
			map.put(5, "Grape");
		}
		System.out.println("Value Apple : " + map.containsValue("Apple"));
		
		
	
		System.out.println("\n---- size() ----");
		System.out.println("크기 : " + map.size());
		System.out.println("map : " + map);
		

		
		System.out.println("\n---- isEmpty() ----");
		System.out.println("비었는가? " + map.isEmpty());
		
		
		
		System.out.println("\n---- remove() ----");
		map.remove("C"); 	//key를 찾아서 Entry를 제거한다
		System.out.println("map : " + map);
		
		System.out.println("-----");
//		map.remove(2, "Banana");	//key를 찾아서 value가 일치하는 쌍을 제거
		map.remove(2, "Orange");	//key를 찾아서 value가 일치하는 쌍을 제거
		System.out.println("map : " + map);
		
		
		
		System.out.println("\n---- null 값 처리 ----");
		
		//에러는 아니지만 Key가 Null인 상황은 좋지 않음
		//	-> Hashtable은 key값, value값으로 null을 허용하지 않는다
		map.put(null, "Bob");
		map.put(10, null);
		System.out.println("map : " + map);
		
		map.put(null, null);
		System.out.println("map : " + map);
		
		
		
		System.out.println("\n---- map <-> set ----");
		
		//map -> set
		Set keySet = map.keySet();		//key를 Set으로 추출
		Set entrySet = map.entrySet();	//key-value쌍(entry)을 Set으로 추출
		
		System.out.println(keySet);
		System.out.println(entrySet);
		
		
		
		System.out.println("\n---- keySet을 이용한 map 반복 ----");
		
		Set keys = map.keySet();		//키 셋 추출
		Iterator iter = keys.iterator();//Key Set에 대한 Iterator
		
		while( iter.hasNext() ) {
			Object key = iter.next(); //key 추출
			
			//key를 이용한 value 활용(출력)
			System.out.println( map.get(key) );
		}
		
		
		
		
		
		
		
		
	}
}
