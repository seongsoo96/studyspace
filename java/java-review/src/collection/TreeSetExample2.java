package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(99));
		scores.add(new Integer(95));
		scores.add(new Integer(76));
		scores.add(new Integer(65));
		scores.add(new Integer(86));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet ) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		
	}
}
