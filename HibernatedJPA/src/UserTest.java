import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.one2one.Address;
import lti.pojo.one2one.User;
import lti.util.HibernateUtil;

public class UserTest {

	@Test
	public void testCase() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		User u = new User();
		u.setFirstname("Polo");
		u.setLastname("Mint");
		u.setUsername("polo");
		u.setPassword("polo123");

		Address address = new Address();
		address.setCity("Mumbai");
		address.setStreet("Chembur");
		address.setZipcode("400083");

		u.setAddress(address);
		address.setUser(u);

		session.save(u);
		session.save(address);
		tx.commit();
	}

}
