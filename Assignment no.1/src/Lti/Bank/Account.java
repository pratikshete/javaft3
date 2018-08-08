package Lti.Bank;
/**
 * G
 * @author noobs
 * @version 1.0
 */
public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	private static int integer = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected int idx;
	protected CurrentTransaction[] txcs;
	protected int cudx;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.accNo = integer++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating transaction array of the Account
		txns = new Transaction[10];
		txcs =new CurrentTransaction[10];
		// Adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
		txcs[cudx++]= new CurrentTransaction("ob",balance,balance,OVERDRAFT_AMT);
	}

	public void summary() {
		System.out.println("A/C No: " + accNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	public double balance() {
		System.out.println(balance);
		return balance;

	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("CR", amount, balance);
	}


	public void statement() {
		System.out.println("Statement of Account   " + accNo);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i]);

	}
}
