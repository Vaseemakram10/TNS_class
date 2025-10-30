package com.tnsif.Interface;

public class Account  {
	private String Name;
	private double bal;
	@Override
	public String toString() {
		return "Account [Name=" + Name + ", bal=" + bal + ", accNo=" + accNo + "]";
	}
	private int accNo;
	private Bank bank;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public  void deposit(double amount) {
		bank.deposit(this, amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(this, amount);
	}
	public Account(String name, double bal, int accNo, Bank bank) {
		
		this.Name = name;
		this.bal = bal;
		this.accNo = accNo;
		this.bank = bank;
	}
	
}
