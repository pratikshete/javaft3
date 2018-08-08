package Lti.library;

public class Test {

	public static void main(String[] args) {

		Book alc = new Book("The Alchemist");
		Member mbr = new Member("Polo");
		
		alc.issueBook(mbr);
		alc.memberDetails();
		
		alc.issueBook(mbr);
		
	}

}
