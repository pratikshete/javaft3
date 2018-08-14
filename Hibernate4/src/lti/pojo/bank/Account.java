package lti.pojo.bank;

import java.util.HashSet;
import java.util.Set;

import lti.pojo.one2many.Employee;

public class Account {

	private int accNo;
	private String holder;
	protected double balance;

	private static int integer = 1001;

	protected Transaction[] txns;
	protected int idx;
	
	private Set<Transaction> trans = new HashSet<Transaction>();

	public Account() {
	}

	public Account(String holder, double balance) {
		this.accNo = integer++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating transaction array of the Account
		txns = new Transaction[10];
		// Adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
	}

}
