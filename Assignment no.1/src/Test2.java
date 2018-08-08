
public class Test2 {

	public static void main(String[] args) {
		Book alc = new Book("Alchemist");
		Member m1 = new Member("Polo");

		alc.issueBook(m1);
		alc.getMember();
		m1.getbook();
		alc.returnBooks(m1);
		alc.returnBooks(m1);

	}

}
