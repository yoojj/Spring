package ex.spring.framework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	@Before 
	public void before() {
		
		// @Test 메소드 실행 전 실행되는 메소드 
	}
	
	@Test
	public void test() {
		
		// 테스트될 메소드
		
	}
	
	@After
	public void after() {
		
		// @Test 메소드 실행 후 실행되는 메소드 
		
	}
	
}