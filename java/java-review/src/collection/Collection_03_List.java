package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_List {
	public static void main(String[] args) {
		List list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println(list);
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
				
	}
}
