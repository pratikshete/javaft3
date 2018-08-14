package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	
	@Test
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex2/appctx2.xml");
		MessageRouter router = (MessageRouter) ctx.getBean("router");
		
		router.processMessage("sms", "420Zubair", "HelloZubairS");
		router.processMessage("email", "imzubair@gmail.com", "Howdy Zubair");
		router.processMessage("tweet", "@imzubair", "hola Zubair");
	}

}
