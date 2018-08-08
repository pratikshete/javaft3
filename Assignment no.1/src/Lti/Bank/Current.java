package Lti.Bank;

public class Current extends Account {

	protected double overdraft = OVERDRAFT_AMT;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < 0) {
				overdraft += balance;
				balance = 0;
			}
			txcs[cudx++]= new CurrentTransaction("ob",balance,amount,overdraft);
		}

		else
		throw new 	BalanceException("zero bal and zero od");
	}

	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;

		}
		txcs[cudx++]= new CurrentTransaction("ob",balance,amount,overdraft);
	}
	
	@Override
	public double balance() {
		System.out.println("Balance: " + balance + " and Overdraft available: " + overdraft);
		return 0;
	}

	@Override
	public void statement() {
		System.out.println("Statement of A/C: " );
		for (int i = 0; i < cudx; i++) {
			System.out.println(txcs[i]);
		}
	
	}


}
