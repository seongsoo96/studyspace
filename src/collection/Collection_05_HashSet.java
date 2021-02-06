package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_05_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(30);
		set.add(10);
		set.add(20);
		
		for(int i=0; i<10; i++) {
			set.add(i*10);
		}
		System.out.println(set);
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("크기: " + set.size());
		System.out.println("비었는가: " + set.isEmpty());
		System.out.println("50이존재?: " + set.contains(50));
		System.out.println("30을 제거: " + set.remove(30));
		System.out.println(set);
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set);
		
	}
}
