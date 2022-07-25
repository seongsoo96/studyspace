package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("cherry");
		treeSet.add("forever");
		treeSet.add("love");
		treeSet.add("gasmathdog");
		treeSet.add("ever");
		treeSet.add("zoo");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet){
			System.out.println(word);
		}
	}
}
