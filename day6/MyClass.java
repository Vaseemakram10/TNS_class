package com.tnsif.day6;

public class MyClass {
	private int section;// non static
	private static int srNo=1000;// static
	
	static {
		System.out.println("------with in static -------");
		srNo++;
	}

	public MyClass(int section) {
		
		this.section = section;
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "srNo= " + srNo +"]";
	}


	public static void display() {
		System.out.println("serial number "+ srNo);
	}

	
	
}
