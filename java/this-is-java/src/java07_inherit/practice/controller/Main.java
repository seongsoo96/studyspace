package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
//		* 구현내용
//		Circle 배열 초기화 : 3개
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리	
		
		Circle[] ci = new Circle[3];
		
		ci[0] = new Circle();
		ci[1] = new Circle(10, 20, 3);
		ci[2] = new Circle(4, 5, 7);
		
		for(int i=0; i<ci.length; i++) {
			ci[i].draw();
			System.out.println("------------");
		}
		
		System.out.println("= = = = = = = = = = =");
		
		//for-each 구문
		//	배열이나 컬렉션의 모든 요소를 이용한
		//	반복작업을 쉽게 수행할 수 있게 하는 반복문
		
		//for( 요소의 타입 변수 : 배열이름 ) {
		//}
		
		//배열의 요소를 0번째부터 하나씩 변수에 대입하며
		//마지막까지 반복한다
		
		for( Circle c : ci ) {
			c.draw();
			System.out.println("------------");
		}
		
		System.out.println("= = = = = = = = = = =");
		
		Rectangle[] rects = {
				new Rectangle(),
				new Rectangle(1, 2, 3, 4),
				new Rectangle(5, 6, 7, 8)
		};
		
		for( Rectangle rect : rects ) {
			rect.draw();
			System.out.println("------------");
		}
		
		System.out.println("= = = = = = = = = = =");
		
		Rectangle[] rects2 = new Rectangle[] {
				new Rectangle(),
				new Rectangle(11, 22, 33, 44),
				new Rectangle(55, 66, 77, 88),
		};
		
		for( Rectangle rect : rects2 ) {
			rect.draw();
			System.out.println("------------");
		}
		
		
	}
}











