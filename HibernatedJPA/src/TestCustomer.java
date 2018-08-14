import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class TestCustomer {
	@Test
	public void testSaveCustomer() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction(); // mandatory for performing dml

		try {
			txn.begin(); // Starting DB transaction
			Customer cust = new Customer();
			cust.setCustName("Polo");
			cust.setCreditLimit(1000);
			session.save(cust); // Saving customer object
			txn.commit(); // ending transaction with commit
		} catch (Exception e) {
			txn.rollback(); // Transaction failed hence rollback
			e.printStackTrace();
		}
	}

	@Test
	public void testGetCustomer() {
		Session session = HibernateUtil.getSession(); // fetching record so no transaction required but if
														// table has relationship it may ask for it
		Customer cust = (Customer) session.get(Customer.class, 2);
		System.out.println("Name: " + cust.getCustName());

	}

}
