package java07_inherit.practice.model;

public class Point {
	
	//--- Field ---
	protected int x; //x좌표
	protected int y; //y좌표
	
	
	//--- Constructor ---
	public Point() {
		//기본 좌표는 (0,0)으로 한다 안 써도 무방함
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//--- Method ---
	public void draw() {
		System.out.println("(" + x + ", " + y + ")" );
	}
	
	
	
	
	
	//--- Getters, Setters ---
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
