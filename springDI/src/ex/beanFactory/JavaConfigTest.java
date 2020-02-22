package ex.beanFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex.bean.BoardService;
import ex.bean.CommunityBoardServiceImpl;
import ex.bean.NoticeBoardServiceImpl;

@Configuration
public class JavaConfigTest {

	@Bean(name="notice")
	public BoardService getNotice() {
		return new NoticeBoardServiceImpl();
	}
	
	@Bean(name="community")
	public BoardService getCommunity() {
		return new CommunityBoardServiceImpl();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test() {
		
		final ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfigTest.class);
		
		final BoardService board = (BoardService) context.getBean("community");
		
		board.insert(null);

	}
	
}