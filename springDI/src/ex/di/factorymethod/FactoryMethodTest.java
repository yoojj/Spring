package ex.di.factorymethod;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex.bean.Factory;

public class FactoryMethodTest {

	@Test 
	public void test() {
		
		final AbstractApplicationContext context = new ClassPathXmlApplicationContext("ex/di/factorymethod/beans.xml");

		final Factory f1 = (Factory) context.getBean("constructor");
		final Factory f2 = (Factory) context.getBean("instance");

		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		context.close();
		
	}

}