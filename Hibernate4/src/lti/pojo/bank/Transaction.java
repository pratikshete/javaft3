package lti.pojo.bank;

public class Transaction {

	protected String type;
	protected double amount, balance;

	public Transaction() {

	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	
}
