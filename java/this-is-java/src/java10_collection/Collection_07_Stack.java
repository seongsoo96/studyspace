package java10_collection;

import java.util.Stack;

public class Collection_07_Stack {
	public static void main(String[] args) {
		
		//스택 객체
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");

		System.out.println(stack);
		
		System.out.println("--------------");
		
		System.out.println( stack.pop() );	//데이터를 꺼낸다
		System.out.println( stack.pop() );
		
		System.out.println(stack);
		
		System.out.println("--------------");
		
		System.out.println( stack.peek() );	//데이터를 확인한다, 꺼내진 않음
		System.out.println( stack );
		
		
		
		
		
	}
}
