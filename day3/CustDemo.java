package com.tnsif.day3;

import java.util.*;

public class CustDemo {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter ");
String name;
long phno;
String feedback;
name=sc.nextLine();
//sc.nextLine();
feedback=sc.nextLine();
phno=sc.nextLong();
System.out.println("Display");
Customer c=new Customer("jgdus",457383532,"good");
System.out.println(c.toString());
c.setName(name);
c.setPhno(phno);c.setFeedback(feedback);
System.out.println(c.toString());
	}
}
