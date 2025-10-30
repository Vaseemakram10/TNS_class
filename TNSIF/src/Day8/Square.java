package com.tnsif.day8;

public class Square extends Shape{
	private float side;

	public Square(float side) {
		
		this.side = side;
	}
	void calArea() {
		//System.out.println("Area of square ="+ side*side);
		area=side*side;
	}
}
