package com.tnsif.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ChildThread c1=new ChildThread(5,"Hello");
		ChildThread c2=new ChildThread(4,"World");
		c1.start();
		c2.start();
	}

}
