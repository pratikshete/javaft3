package guesswho;

public class Manager extends Employee {
	private double commission; 

	public Manager() {

	}

	public Manager(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;

	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println(commission);
	}

	@Override
	public double getsalary() {
		return super.getsalary() + commission;

	}
}
