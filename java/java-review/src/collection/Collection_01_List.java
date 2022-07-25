package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_01_List {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.set(0, "Durian");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("Cherry");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		ArrayList l1 = null;
		ArrayList l2 = new ArrayList();
		
		System.out.println(l1);
		System.out.println(l2);
		
//		System.out.println(l1.isEmpty());
		System.out.println(l2.isEmpty());
		
		
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		list.add(123);
		list.add(123.34);
		list.add("rkskek");
		list.add(true);
		
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		Vector list3 = new Vector();
		
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Apple");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
