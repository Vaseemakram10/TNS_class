package com.tnsif.day8;

abstract class Shape {
protected float area;

abstract void calArea();// abstract method 

void show() {//concrete method
	System.out.println("Calcualated area is "+area);
}
}
