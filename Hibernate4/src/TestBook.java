


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.util.HibernateUtil;

public class TestBook {

	@Test
	public void testSaveBook() {
		Session session = HibernateUtil.getSession();

		Transaction txn = session.getTransaction();
		txn.begin();
		Book alc = new Book(325412, "The Alchemist", "Paulo Coehlo", 350);
		session.save(alc);
		txn.commit();

	}

	@Test
	public void getTestBook() {

		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.get(Book.class, 1);
		System.out.println(bk);
	}

	@Test
	public void testGetByIsbn() {

		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(325412);
		System.out.println(bk);
	}
}
