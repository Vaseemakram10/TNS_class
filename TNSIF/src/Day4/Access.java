// program to demonstrate package and access modifiers
package com.tnsif.day4;


public class Access {

	// Declare default, public, protected and private
	int vardef=10;
	public int varpub=20;
	protected int varprot=30;
	private int varpriv=40;
	
	// declare methods 
	void def() {
		System.out.print("Default variable : ");
		System.out.println(vardef);
	}
	public void pub() {
		System.out.print("Public variable : ");
		System.out.println(varpub);
	}
	protected void prot() {
		System.out.print("Protected variable : ");
		System.out.println(varprot);
	}
	private void priv() {
		System.out.print("Private variable : ");
		System.out.println(varpriv);
	}
}
