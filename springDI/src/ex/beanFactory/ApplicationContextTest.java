package ex.beanFactory;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex.bean.BoardService;

public class ApplicationContextTest {
	
	// - ApplicationContext
	// - ConfigurableApplicationContext
	// - AbstractApplicationContext
	// - GenericApplicationContext
	// - AnnotationconfigApplicationContext
	// - GenericGroovyApplicationContext 
	
	
	
	String beanLocation;
	
	@Before 
	public void init() {
		this.beanLocation = "ex/beanFactory/beans.xml";
	}
	
	@Test @Ignore
	public void applicationContextTest() {

		@SuppressWarnings("resource")
		final ApplicationContext context = 
			new ClassPathXmlApplicationContext(beanLocation);
		
		final BoardService board = (BoardService) context.getBean("notice");
		
		board.select(1);
		
	}
	
	@Test @Ignore
	public void abstractApplicationContexTest() {
		
		final AbstractApplicationContext context = 
			new ClassPathXmlApplicationContext(beanLocation);
		
		final BoardService board = (BoardService) context.getBean("notice");
		
		board.select(1);
		
		context.close();
		
	}
	
	@Test
	public void genericXmlApplicationContextTest() {
		
		final AbstractApplicationContext context = 
			new GenericXmlApplicationContext(beanLocation);
		
		final BoardService board = (BoardService) context.getBean("notice");
		
		board.select(1);
		
		context.close();
		
	}
	
}