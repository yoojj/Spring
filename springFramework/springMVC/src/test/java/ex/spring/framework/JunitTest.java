package ex.spring.framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {

	@Before 
	public void before() {
		
		// @Test 메소드 실행 전 동작하는 메소드
		System.out.println("before");

	}
	
	@BeforeClass
	public static void beforeClass() {
		
		// 모든 테스트 메소드 실행 전 한 번만 동작하는 static 메소드 
		System.out.println("beforeClass");
		
	}
	
	@Test
	public void test() {
		
		// 테스트될 메소드
		System.out.println("test!");
		
	}
	
	@Test(timeout=3000)
	public void timeoutTest() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("timeout test!");
		
	}
	
	@Test(expected=Exception.class)
	public void exceptionTest() {
		
		System.out.println("exception test");
		System.out.println(1/0);
		
	}
	
	@Ignore
	public void ignore() {
	
		// 실행에서 제외될 메소드
		System.out.println("ignore");
		
	}
	
	@After
	public void after() {
		
		// @Test 메소드 실행 후 동작되는 메소드 
		System.out.println("after");
		
	}
	
	@AfterClass
	public static void afterClass() {
		
		// 모든 테스트 메소드 실행 후 한 번만 동작하는 static 메소드 
		System.out.println("afterClass");
		
	}
	
}