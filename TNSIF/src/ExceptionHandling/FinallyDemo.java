package com.tnsif.ExceptionHandling;
import java.util.*;
public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter ");
		int num=sc.nextInt();
		System.out.println(num%2==0?num+"is Even": num+" is odd");
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		finally {
			System.out.println("In finally...");
		}
		System.out.println("Hello");
	}

}

