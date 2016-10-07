package com.assignment4.superclasses;

import java.util.*;
import com.assignment4.interfaces.BankOperations;

/**
 *
 * @author lisabromark
 */
public class BankAccount implements BankOperations {

	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0;

	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawMoney(double amount) {

		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value!");
		}

	}

	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative value");
		}
	}

	@Override
	public String toString() {
		return "BankAccount{" + "accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance="
				+ balance + '}';
	}

}
