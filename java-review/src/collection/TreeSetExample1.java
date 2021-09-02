package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(99));
		scores.add(new Integer(95));
		scores.add(new Integer(76));
		scores.add(new Integer(65));
		scores.add(new Integer(86));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.floor(new Integer(96));
		System.out.println("95점이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수 : " + score);
		
		Iterator iter = scores.iterator();
		
		while(!scores.isEmpty()) {
			
			System.out.println(scores);
			score = scores.pollFirst();
			
			System.out.println(score + " 남은 객체수: " + scores.size());
		}
	}
}
