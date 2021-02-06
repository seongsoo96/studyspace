package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_06_HashMap {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("a", "Apple");
		map.put(2, "Banana");
		map.put("C", "Cherry");
		
		System.out.println("map: " + map);
		System.out.println(map.get("C"));
		System.out.println(map.get(2));
		
		map.put("a","Durian");
		System.out.println("map: " + map);
		
		map.put(true, "Hello");
		
		map.put(1, "Banana");
		
		System.out.println("map: " + map);
		
		
		System.out.println("Key 5: " + map.containsKey(5));
		
		if(!map.containsKey(5)) {
			map.put(5, "Grape");
		}
		System.out.println("map: " + map);
		
		System.out.println("Value Banana: " + map.containsValue("Banana"));
		
		
		System.out.println("크기 : " + map.size());
		
		System.out.println("비었나? " + map.isEmpty());
		map.remove("a");
		System.out.println(map);
		
		map.remove(2, "Banana");
		System.out.println(map);
		
		
		map.put(null, "Bab");
		map.put(10, null);
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		
		System.out.println(keySet);
		System.out.println(entrySet);
		
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		
		while(iter.hasNext()) {
			Object key = iter.next();
			
			System.out.println(map.get(key));
		}
		
		
		
		
		
	}
}
