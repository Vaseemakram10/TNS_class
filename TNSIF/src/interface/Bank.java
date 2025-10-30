package com.tnsif.Interface;



public interface Bank {
	double MinBal =1000;
	double Deposit=25000;
	double Intrest=5;
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);
}
