package Lti.Bank;

public class Transaction extends Account {

	protected String type;
	protected double amount, balance;

	public Transaction() {

	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

	}

	@Override
	public String toString() {
		return type + " amount " + amount + " balance " + balance;
	}

}
