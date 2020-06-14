package ex.di.xmlconfig;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import ex.bean.Board;
import ex.bean.BoardService;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test @Ignore
	public void beanFactoryTest() {

		final BeanFactory factory = new XmlBeanFactory(new ClassPathResource("ex/di/xmlconfig/beans.xml"));

		// 해당 이름으로 빈이 정의되었는지 여부 반환 
		System.out.println(factory.containsBean("boardService"));
		
		// 해당 이름으로 지정된 빈의 알리아스 반환 
		for(String s : factory.getAliases("boardService")) {
			System.out.println(s);
		}
		
		// 해당 이름으로 지정된 빈의 타입 반환 
		System.out.println(factory.getType("boardService"));
		
		// 해당 이름으로 지정된 빈이 싱글톤인지 여부 반환 
		System.out.println(factory.isSingleton("boardService"));
		
		// 해당 클래스로 지정된 빈 인스턴스 생성 
		factory.getBean(BoardService.class);

		// 해당 이름으로 지정된 빈 인스턴스 생성 
		factory.getBean("boardService");
		
		// 해당 이름과 클래스로 지정된 빈 인스턴스 생성 
		factory.getBean("boardService", BoardService.class);
		factory.getBean("Alias", BoardService.class);
	}
	
	@Test 
	public void XmlBeanFactoryTest() {
		
		// 1. 빈 팩토리 생성 
		final BeanFactory factory = new XmlBeanFactory(new ClassPathResource("ex/di/xmlconfig/beans.xml"));

		// 2. 빈 인스턴스 생성 
		final BoardService service = factory.getBean("boardService", BoardService.class);
		
		final Board board = new Board();
		board.setNo(1);
		board.setTitle("title");
		board.setContent("content");
		
		System.out.println(service.insert(board));
		System.out.println(service.select().toString());

	}

}