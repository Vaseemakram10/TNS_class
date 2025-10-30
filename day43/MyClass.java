// program to demontrate singleton class
package com.tnsif.day43;

public class MyClass {
	private static MyClass obj=new MyClass();
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MyClass() {
		//super();
		System.out.println("Object is created");
	}
	public static MyClass getObject() {
		return obj;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
}
