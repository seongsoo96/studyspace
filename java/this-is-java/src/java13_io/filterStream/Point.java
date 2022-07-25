package java13_io.filterStream;

import java.io.Serializable;

public class Point implements Serializable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	//toString() 오버라이드 단축키 : ctrl + option + s (내가 설정함)
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}
