package ex.spring.framework;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml", 
		"classpath:config/app/servlet-context.xml",
		"classpath:config/app/db-context.xml"})
@WebAppConfiguration
public class ConnectionTest {

	@Autowired
	private DataSource ds;

	@Test
	public void test() throws Exception {

		try(final Connection conn = ds.getConnection()){ 
			
			System.out.println(conn);
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
	}
	
}