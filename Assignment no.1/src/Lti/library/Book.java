package Lti.library;

public class Book {

	private String title;
	private Member member;

	public Book() {

	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void memberDetails() {
		if (member != null)
			System.out.println(title + "is issued to" + member.getName());
		else
			System.out.println(title + "not issued to any member");
	}

	public void issueBook(Member mbr) {
		if (member != null)
			System.out.println(title + "is already issued to" + member.getName());
		else
			mbr.setBook(this);
		this.member = mbr;
		System.out.println(title + "issued to" + member.getName());
	}

	public void returnBook() {
		if (member == null || !member.getName().equals(member.getName()) || member.getBook() == null) {
			System.out.println(title + "not issued to" + member.getName());
		} else {
			member.setBook(null);
			this.member = null;
			System.out.println(title + "is reutrned by " + member.getName());
		}
	}

}
