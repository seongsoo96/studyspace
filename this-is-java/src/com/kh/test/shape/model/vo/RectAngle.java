package com.kh.test.shape.model.vo;

public class RectAngle {
	
	private int width;
	private int height;
	
	public RectAngle() {
		
	}
	
	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("가로 " + width + "cm, 세로 " + height + "cm인 사각형을 그립니다.");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
