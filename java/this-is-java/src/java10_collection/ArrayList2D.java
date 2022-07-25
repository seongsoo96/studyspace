package java10_collection;

import java.util.ArrayList;

public class ArrayList2D {
	public static void main(String[] args) {
		ArrayList<ArrayList> list2D = new ArrayList<>();
		
		list2D.add( new ArrayList() );
		list2D.add( new ArrayList() );
		list2D.add( new ArrayList() );

		list2D.get(0).add("Apple1");
		list2D.get(0).add("Apple2");
		
		list2D.get(1).add("Banana1");
		list2D.get(1).add("Banana2");
		list2D.get(1).add("Banana3");
		
		list2D.get(2).add("Cherry1");

		for(int i=0; i<list2D.size(); i++) {
			for(int j=0; j<list2D.get(i).size(); j++) {
				System.out.print(list2D.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
		
	}
}