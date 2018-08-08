
public class Member {
	static String name;

	Member(String s) {
		name = s;
	}

	void getbook() {
		if (Book.f == true)
			System.out.println(name + " has been issued " + Book.title);
		else
			System.out.println(Book.title + " not issued ");
	}

}
