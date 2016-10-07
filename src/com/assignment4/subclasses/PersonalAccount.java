package com.assignment4.subclasses;

import com.assignment4.superclasses.BankAccount;
import java.util.UUID;

/* PersonalAccount is a subclass to BankAccount
 * 
 */

public class PersonalAccount extends BankAccount {

	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");

	}
}
