package ex.di.javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex.bean.BoardService;
import ex.bean.BoardServiceImpl;


@Configuration
public class JavaConfigTest {

	@Bean(name="service")
	public BoardService getService() {
		return new BoardServiceImpl();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test() {
		
		final ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigTest.class);
		
		final BoardService service = (BoardService) context.getBean("service");
		
		System.out.println(service.select().toString());

	}
	
}