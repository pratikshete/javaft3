package guesswho;

public class Employee {

	private int empNo;
	private String empName;
	private double salary;

	private static int autogen;

	static {
		System.out.println("employee class loaded...");
		autogen = 1001;
	}

	public Employee() {

	}

	public Employee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("empNo:" + empNo);
		System.out.println("empname:-" + empName);
		System.out.println("SALARY" + salary);

	}

	public double getsalary() {
		return salary;

	}
}
