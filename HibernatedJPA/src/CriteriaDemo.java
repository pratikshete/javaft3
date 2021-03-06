import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import lti.pojo.Customer;
import lti.util.HibernateUtil;
import oracle.net.aso.s;

public class CriteriaDemo {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();

		Criteria criteria = session.createCriteria(Customer.class);

		criteria.add(Restrictions.between("creditLimit", 100.0, 5000.0));
		criteria.add(Restrictions.like("custName", "_olo"));
		

		List<Customer> customers = criteria.list();
		for (Customer cust : customers)
			System.out.println(cust.getCustName() + "\t" + cust.getCreditLimit());
	}

}
