package com.tnsif.day6;

public class finalvar {
	final int x=10;
	final static int z=20;
	final static int y;
	// error code method x is final so error and y is static- final  
	void change() {
		x=40;
		y=2446;
	}
	@Override
	public String toString() {
		return "finalvar [x=" + x +", Y "+y+ "]";
	}
	static {
		y=200; 
		//z=20; error as z value is already loaded
	}
}
