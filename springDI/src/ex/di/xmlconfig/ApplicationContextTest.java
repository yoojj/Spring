package ex.di.xmlconfig;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex.bean.BoardService;

public class ApplicationContextTest {
	
	private String beanLocation = "ex/di/xmlconfig/beans.xml";
	
	@Test @Ignore
	public void classPathXmlApplicationContextTest() {
		
		final AbstractApplicationContext context = new ClassPathXmlApplicationContext(beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
		
		context.close();

	}
	
	@Test @Ignore
	public void fileSystemXmlApplicationContextTest() {

		final AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/" + beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
	
		context.close();
		
	}
	
	@Test 
	public void genericXmlApplicationContextTest() {
		
		// GenericXmlApplicationContext
		// ClassPathXmlApplicationContext + FileSystemXmlApplicationContext 
		
		final GenericApplicationContext context = new GenericXmlApplicationContext(beanLocation);
		
		final BoardService service = context.getBean("boardService", BoardService.class);
		
		System.out.println(service.select().toString());
		
		context.close();
		
	}

}