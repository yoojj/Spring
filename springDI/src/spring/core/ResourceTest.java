package spring.core;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class ResourceTest {

	@Test 
	public void classPathResource() throws IOException {

		final Resource resource = new ClassPathResource("ex/di/xmlconfig/beans.xml");
		
		System.out.println(resource.exists());

	}
	
	@Test @Ignore
	public void fileSystemResource() throws IOException {
		
		final Resource resource = new FileSystemResource("bin/ex/di/xmlconfig/beans.xml");
		
		System.out.println(resource.exists());
		
	}

	@Test @Ignore
	public void inputStreamResource() throws IOException {
		
		final Resource resource = new InputStreamResource(
				this.getClass().getResourceAsStream("/ex/di/xmlconfig/beans.xml"));
		
		System.out.println(resource.exists());
		
	}
	
	@Test @Ignore
	public void urlResource() throws IOException {
		
		final Resource resource = new UrlResource("file:/home/생략/bin/ex/di/xmlconfig/beans.xml");
		
		System.out.println(resource.exists());
		
	}
	
}