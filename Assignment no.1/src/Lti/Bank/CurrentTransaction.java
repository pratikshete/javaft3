package Lti.Bank;

public class CurrentTransaction extends Transaction {

	
	private double overdraft;
	

	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, double overdraft) {
		super(type,amount,balance);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

	}

	@Override
	public String toString() {
		return type + " amount " + amount + " balance " + balance + "overdraft" + overdraft;
	}

}
