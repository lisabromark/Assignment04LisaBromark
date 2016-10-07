package com.assignment4.subclasses;

import java.util.UUID;
import com.assignment4.superclasses.BankAccount;

/* SavingsAccount is a subclass to BankAccount
 * 
 */
public class SavingsAccount extends BankAccount {

	public SavingsAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0);
		this.setAccountType("Savings account");

	}
}
