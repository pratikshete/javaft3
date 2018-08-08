import java.util.Scanner;

public class EmailVerification {

	Scanner sc = new Scanner(System.in);
	String email;

	public void getEmail() {
		System.out.println("Enter email:-");
		email = sc.next();
	}

	void emailVerify() {

		int a = email.indexOf('@');
		int b = email.indexOf('.');

		String s1=email.substring(0, a);
		String s2=email.substring(a+1, b);
		String s3=email.substring(b+1);
		
	if(s1.length()>3 && s2.length()>2 && s3.length()>1 && a==email.lastIndexOf('@') && b==email.lastIndexOf('.') ) {
		System.out.println("Valide Email");
		
	}
	else {
		System.out.println("Please Enter Valid Email :)");
	}
	}
	
}
