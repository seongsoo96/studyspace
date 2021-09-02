package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main2 {
	public static void main(String[] args) {
//		* 구현내용
//		1. Point 형 객체 배열 선언, 생성 : 5개
//		2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
//		3. for 문 사용 : draw() 메소드 실행함
		
		//--------------------------------------------
		
		//부모타입 객체배열 - Point
		Point[] pArr = new Point[5];
		
		pArr[0] = new Circle();
		pArr[1] = new Rectangle();
		pArr[2] = new Circle(6,8,7);
		pArr[3] = new Rectangle(6, 8, 9, 10);
		pArr[4] = new Rectangle(9, 22, 11, 13);
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i].draw();
			System.out.println("-------------");
		}
		
		System.out.println("= = = = = = = = = = =");
		
		for(Point p : pArr) {
			p.draw();
			System.out.println("-------------");
		}
		
	}
}
