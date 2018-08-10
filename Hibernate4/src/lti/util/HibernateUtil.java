package lti.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getSession() {
		Configuration cf = new Configuration().configure();
		SessionFactory factory = cf.buildSessionFactory();
		return factory.openSession();
	}

}
