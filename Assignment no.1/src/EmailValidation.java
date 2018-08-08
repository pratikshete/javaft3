import java.util.Scanner;

public class EmailValidation {

	Scanner sc = new Scanner(System.in);
	String email;

	public void getEmail() {
		System.out.println("Enter email:-");
		email = sc.next();
	}

	void emailVerify() {

		if (email.substring(0, email.indexOf('@')).length() > 3
				&& email.substring(email.indexOf('@') + 1, email.indexOf('.')).length() > 2
				&& email.substring(email.indexOf('.') + 1).length() > 1 && email.indexOf('@') == email.lastIndexOf('@')
				&& email.indexOf('.') == email.lastIndexOf('.')) {
			System.out.println("Valide Email");

		} else {
			System.out.println("Please Enter Valid Email :)");
		}

	}

}
