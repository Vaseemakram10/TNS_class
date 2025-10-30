package com.tnsif.ExceptionHandling;

import java.util.*;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		System.out.println("in main method");
		int n1,n2,n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		while(true)
		{try {
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=n1/n2;
			System.out.println(n3);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
}
