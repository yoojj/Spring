package ex.di.xmlconfig;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex.bean.BoardService;

public class ApplicationContextTest {
	
	private String beanLocation = "ex/di/xmlconfig/beans.xml";
	
	@Test 
	public void applicationContextTest() {

		@SuppressWarnings("resource")
		final ApplicationContext context = new ClassPathXmlApplicationContext(beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
		
	}
	
	@Test @Ignore
	public void abstractApplicationContexTest() {
		
		final AbstractApplicationContext context = new ClassPathXmlApplicationContext(beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
		
		context.close();
		
		
	}
	
	@Test @Ignore
	public void genericXmlApplicationContextTest() {
		
		final AbstractApplicationContext context = new GenericXmlApplicationContext(beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
		
		context.close();
		
	}

}