import java.util.Date;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Orders;
import lti.util.HibernateUtil;

public class TestOrder {

	@Test
	public void testOrder() {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Orders o = new Orders();
		o.setOrderDate(new Date());
		o.setPromoCode("Sale");
		o.setAmount(5000);
		
		session.save(o);
		
		tx.commit();
		
	}

}
