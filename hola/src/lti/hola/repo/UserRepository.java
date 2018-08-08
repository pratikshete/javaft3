package lti.hola.repo;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;

/**
 * Repository Interface for variety of databases.
 * @author Nikhil Jagtap, Pratik Shete
 * Version 1.0
 */
public interface UserRepository {

	RegisterBean authenticate(LoginBean login);

	boolean validate(ForgetBean forget);

	boolean changePassword(LoginBean login);

	boolean persist(RegisterBean register);
}
