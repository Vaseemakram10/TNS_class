package com.tnsif.day8;

public class Rectangle extends Shape{
	private float width,height;
	
	public Rectangle(float width, float height) {
		
		this.width = width;
		this.height = height;
	}
	void calArea() {
		
		System.out.println("Area of rectangle is ="+width*height);
		
	}

}
