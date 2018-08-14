package ex1;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestPropertySource;

public class TestHelloWorld {
	@Test								
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex1/appctx.xml");	//container object inside testCase

		HelloWorld hw = (HelloWorld) ctx.getBean("hi");
		System.out.println("Name: " + hw.getName());
	}

}
