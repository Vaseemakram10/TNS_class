package com.tnsif.Interface;

public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetClass g1=new GreetClass();
		System.out.println(g1.greet());
		
		
		// lambda expression- directly 
		//calling by interface not by creating sub class 
		GreetInterface g2=()->{
			return "Hello";
		};
	}

}
