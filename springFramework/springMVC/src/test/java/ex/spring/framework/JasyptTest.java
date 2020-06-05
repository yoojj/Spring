package ex.spring.framework;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml", 
		"classpath:config/app/servlet-context.xml",
		"classpath:config/app/db-context.xml"})
@WebAppConfiguration
public class JasyptTest {

	@Test
	public void test() {
		
		final StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
	
		jasypt.setAlgorithm("PBEWithMD5AndDES");
		jasypt.setPassword("key");
		
		String password = jasypt.encrypt("password");
		
		System.out.println(password);
		
	}
	
}