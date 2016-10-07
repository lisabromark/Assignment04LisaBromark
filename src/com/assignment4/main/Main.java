package com.assignment4.main;

import com.assignment4.subclasses.BankCustomer;
import com.assignment4.subclasses.PersonalAccount;
import com.assignment4.subclasses.SavingsAccount;
import com.assignment4.superclasses.BankAccount;

/**
 *
 * @author lisabromark
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		String account = "";

		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);

		PersonalAccount pa = new PersonalAccount();
		pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);

		SavingsAccount sa = new SavingsAccount();
		sa.withdrawMoney(-20);
		sa.withdrawMoney(20);
		System.out.println(sa.toString());

		BankCustomer bc = new BankCustomer("Lisa", 39);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingsAccount());
		System.out.println(bc.toString());

		account = bc.getCustomerAccount().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());

		System.out.println("Withdrawing 200.0 from the first account");
		account = bc.getCustomerAccount().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());

		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccount().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}
