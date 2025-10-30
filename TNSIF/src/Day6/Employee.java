package com.tnsif.day6;

public class Employee {
	//Declaring instance variable
	private String name;
	private int id;
	// Static variable
	static String compName="TNS";
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]"+compName;
	}
	
	
}
