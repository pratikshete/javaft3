package Lti.Bank;

public class TestAccount {

	public static void main(String[] args) {

		Bank cr = AccountFactory.openAccount("current", "polo");
		cr.summary();

		try {
			cr.withdraw(1000);
		System.exit(0);
		
		}
		catch (BalanceException e) {
			// e.printStackTrace(); //for developers to trouble shoot
			// System.out.println(e); // for logging purpose to adult
			System.out.println(e.getMessage()); // for end users
		}
		finally {
			System.out.println("this is finally");
		}

	}

}
