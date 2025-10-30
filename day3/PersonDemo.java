package com.tnsif.day3;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,address;
		long phno,addno;
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter address");
		address=sc.nextLine();
		System.out.println("Enter phno");
		phno=sc.nextLong();
		System.out.println("Enter Addno");
		addno=sc.nextLong();
		Person p1=new Person(name,address,phno,addno);
		p1.toString();

	}

}
