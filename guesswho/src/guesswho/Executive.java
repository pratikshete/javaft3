package guesswho;

public class Executive extends Employee {

	private double bonus;

	public Executive() {
	}

	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		this.bonus = bonus;

	}

	@Override
	public void payslip() {
		super.payslip();

	}

	@Override
	public double getsalary() {
		return super.getsalary() + bonus;
	}

}
