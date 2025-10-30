// Program to demonstrate Person entity with Scanner
package com.tnsif.day3;
import java.util.*;

public class Person {
    private String name;
    private long phno;
    private String address;
    private long addno;

    // Constructor
    public Person(String name, String address, long phno, long addno) {
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.addno = addno;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public long getAddno() {
        return addno;
    }
    public void setAddno(long addno) {
        this.addno = addno;
    }

    public long getPhno() {
        return phno;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }

    // For easy printing
    @Override
    public String toString() {
        return "Person [Name=" + name + ", Address=" + address + 
               ", Phone=" + phno + ", Aadhaar=" + addno + "]";
    }

    // Main method to test with Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter phone number: ");
        long phno = sc.nextLong();

        System.out.print("Enter Aadhaar number: ");
}
}