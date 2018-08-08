package Lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {

	public static void main(String[] args) throws Exception {
		String qcn = "Lti.reflect.Customer";
		
		//Loading the class
		Class custClass = Class.forName(qcn);
		
		//Getting the parameterized constructor
		Constructor custConst = custClass.getConstructor(String.class);
		
		//Instantiating with parameterized constructor
		Object obj = custConst.newInstance("NJ");
		System.out.println(obj);
		
		//getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print", null);
		
		//calling print method in customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
		
	}

}
