package guesswho;

public class TestEmployee {

	public static void main(String[] args) {

		

		Manager mgr = new Manager( "lili", 7000, 2000);
		showSalary(mgr);
		
		Executive e =new Executive("billi",8000,4000);
		showSalary(e);
		
		
		
	}

	private static void showSalary(Employee emp) {

	if(emp  instanceof Manager)
		System.out.println("Manager Salary:"+ emp.getsalary());
	else
		System.out.println("Executive Salary:"+ emp.getsalary());
	}
	

//	private static void showSalary(Manager mgr) {
		// TODO Auto-generated method stub
		
	
	

}
