
public class Book {

	static String title;
	static boolean f = false;
	String m;
	
	

	Book(String s) {
		title = s;

	}

	public void issueBook(Object m1) {
		f = true;
		System.out.println("Book issued." + Member.name);

	}

	public void getMember() {
		if (f == true) {
			System.out.println(title + " is issued to " + Member.name);
		}
	}

	public void returnBooks(Object ob) {
		if (f == false)
			System.out.println("already returned");
		else
			f = false;

	}
}
