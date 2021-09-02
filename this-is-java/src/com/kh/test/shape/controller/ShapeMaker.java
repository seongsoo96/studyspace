package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {
	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		RectAngle[] r = new RectAngle[2];
		
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle();
		}
		
		c[0].setRadius(20);
		c[1].setRadius(40);
		c[2].setRadius(50);
		
		for(int i=0; i<c.length; i++) {
			c[i].draw();
		}
		
		System.out.println();
		
		for(int i=0; i<r.length; i++) {
			r[i] = new RectAngle();
		}
		
		r[0].setWidth(20);
		r[0].setHeight(20);
		r[1].setWidth(50);
		r[1].setHeight(60);
		
		for(int i=0; i<r.length; i++) {
			r[i].draw();
		}
		
	}
}
