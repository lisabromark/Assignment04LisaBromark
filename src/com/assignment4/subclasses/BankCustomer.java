package com.assignment4.subclasses;

/* Importing relevant classes
  */

import com.assignment4.superclasses.Human;
import com.assignment4.superclasses.BankAccount;
import java.util.ArrayList;
import java.util.List;

/* Making sure the BankCustomer class can get access to content in Human class (subclass to Human)
 */

public class BankCustomer extends Human {

	/*
	 * Creating an arraylist for the different accounts a customer may have,
	 * using BankAccount
	 */

	public List<BankAccount> customerAccount = new ArrayList<BankAccount>();

	/*
	 * BankCustomer calls the constructor of the Human superclass, name & age
	 */

	public BankCustomer(String name, int age) {
		super(name, age);
		setName(name);
		setAge(age);
	}

	/*
	 * getters & setters
	 */

	public List<BankAccount> getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(List<BankAccount> customerAccount) {
		this.customerAccount = customerAccount;
	}

	/*
	 * Method for adding an account to the array list
	 */

	public void addAccount(BankAccount bankAccount) {
		customerAccount.add(bankAccount);
	}

	/*
	 * Method for depositing money into an account
	 */

	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).depositMoney(amount);
			}
		}
	}

	/*
	 * Method for withdrawing money from an account
	 */

	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).withdrawMoney(amount);
			}
		}
	}

	/*
	 * As we want each account on a separate line, we have to loop through each
	 * element of the array
	 */

	@Override
	public String toString() {
		String temp = "";
		temp = "\nCustomer " + getName() + " Age = " + getAge() + "\n";
		for (int i = 0; i < customerAccount.size(); i++) {
			temp = temp + customerAccount.get(i).toString() + "\n";

		}
		return temp;
	}
}
