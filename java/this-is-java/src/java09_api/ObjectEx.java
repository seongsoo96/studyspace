package java09_api;

import java.util.Arrays;

//따로 작성하지 않아도 Object클래스를 상속받고 있다
class Point implements Cloneable {
	int x; //x좌표
	int y; //y좌표
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//p2.equals(p3)
		
		//this -> 자기자신, p2
		//obj매개변수 -> 비교대상, p3
		
		if( this.x == ((Point)obj).x && this.y == ((Point)obj).y ) {
			return true; //동등하다, equal to
		} else {
			return false; //동등하지않다, not equal to
		}
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj = new Object();
		Point p1 = new Point(10, 20);
		
		//객체변수를 출력하면 참조값을 출력
		System.out.println(obj);
		System.out.println(p1);
		
		System.out.println("------ toString()-------");
		
		// System.out.println( 객체변수 )를 사용하면
		//객체변수의 toString() 메소드를 호출한 결과를 출력한다
		
		System.out.println( obj.toString() );
		System.out.println( p1.toString() );
		
		System.out.println("\n------ equals()-------");
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2; //얕은 복사
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		//==연산자 비교(동일성 비교), identity
		// -> 같은 객체인지 검사한다
		// -> 참조값(주소)를 비교한다 -> 같은 곳에 저장되어있는지 검사
		System.out.println("p2==p3 : " + (p2==p3));
		System.out.println("p2==p4 : " + (p2==p4));
		
		//equals메소드 비교(동등성 비교), equality
		// -> 객체의 값(변수)가 같은 값을 가지는지 검사
		
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
		
		
		System.out.println("\n------ hashCode()-------");
		
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println("--------");
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		System.out.println("\n------ clone()-------");
		
		Point p_ori = new Point(33, 44);
		
		Point p_clone1 = p_ori; //얕은 복사
		
		Point p_clone2 = new Point( p_ori.x, p_ori.y ); //깊은 복사
		
		//------------------------------------------------
		
		//clone()을 이용한 깊은 복사
		Point p_clone3 = null;
		
		try {
			p_clone3 = (Point) p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println( p_clone3 );
		
		//------------------------------------------------
		
		System.out.println("\n------배열 clone()-------");
		
		System.out.println("");
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] other = arr.clone();
		
		arr[1] = 888;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("other : " + Arrays.toString(other));
	}
	
}
