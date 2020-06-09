package ex.spring.framework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ex.spring.framework.common.util.MessageUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/*.xml", 
		"classpath:config/app/*.xml"})
@WebAppConfiguration
public class MessageUtilTest {

	@Test
	public void test() {

		System.out.println(MessageUtil.getMessage("test.message"));
		
	}
	
}