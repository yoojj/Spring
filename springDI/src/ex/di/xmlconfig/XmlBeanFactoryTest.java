package ex.beanFactory;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import ex.bean.BoardService;

@SuppressWarnings("deprecation")
public class XmlBeanFactoryTest {

	@Test
	public void test() throws IOException {
		
		final Resource resource = new ClassPathResource("ex/beanFactory/beans.xml");
		
		final BeanFactory factory = new XmlBeanFactory(resource);
		
		final BoardService board = (BoardService) factory.getBean("notice");
		
		board.select(1);
		
	}

}