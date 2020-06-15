package ex.di.javaconfig;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import ex.bean.Board;
import ex.bean.BoardService;
import ex.bean.BoardServiceImpl;

@Configuration
public class JavaConfigTest {

	@Bean
	public String getContent() {
		return "content";
	}
	
	@Bean(name="boardBean")
	public Board getBoard() {
		return new Board(1, "javaConfig", getContent());	
	}
	
	@Bean(name="serviceBean")
	public BoardService getService() {
		return new BoardServiceImpl();
	}
	
	@Test
	public void test() {
		
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigTest.class);
		
		final Board board = (Board) context.getBean("boardBean");
		
		final BoardService service = (BoardService) context.getBean("serviceBean");
		
		service.insert(board);
		
		System.out.println(service.select().toString());

		context.close();
		
	}
	
}