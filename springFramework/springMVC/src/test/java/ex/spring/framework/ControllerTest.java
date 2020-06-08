package ex.spring.framework;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml", 
		"classpath:config/app/servlet-context.xml",
		"classpath:config/app/db-context.xml"})
@WebAppConfiguration
public class ControllerTest {

	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mock;
	
	@Before 
	public void init() {
		
		this.mock	= MockMvcBuilders.webAppContextSetup(context).build();
		
	}
	
	@Test
	public void test() throws Exception {
		
		this.mock.perform(MockMvcRequestBuilders.get("/"));
		
	}

}