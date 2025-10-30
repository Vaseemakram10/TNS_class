package com.tnsif.day3;

public class Customer {
	private String name;
	private long phno;
	private String feedback;
	public Customer() {
	
	}
	
	public Customer(String name,long phno,String feedback){
		this.name=name;
		this.phno=phno;
		this.feedback=feedback;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phno=" + phno + ", feedback=" + feedback + "]";
	}

	
	

}
