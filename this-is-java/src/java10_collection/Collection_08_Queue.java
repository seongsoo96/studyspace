package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_08_Queue {
	public static void main(String[] args) {
		
		Queue queue = new LinkedList(); 
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		System.out.println( queue );
		
		System.out.println("--------------");
		
		//Dequeue, 데크 - 큐에서 데이터 꺼내기 및 제거
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		
		System.out.println( queue );
		
		System.out.println("--------------");
		
		System.out.println( queue.peek() );
		System.out.println( queue );
		
	}
}
