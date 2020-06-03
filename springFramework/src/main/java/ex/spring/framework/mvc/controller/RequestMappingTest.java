package ex.spring.framework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestMappingTest {
	
	// @RequestMapping
	// : 클라이언트 요청과 매핑될 클래스나 메소드를 지정하는 어노테이션  
	
	// Spring 4.3
	// - @GetMapping
	// - @PostMapping
	// - @PutMapping
	// - @DeleteMapping
	// - @PatchMapping
	
	
	
	@GetMapping(value={"/", "index"})
	public String indexPage() throws Exception {
		return "index";
	}
	
	@GetMapping("main")
	public void mainPage() throws Exception {
		
		// 경로와 jsp 파일이 일치하면 리턴 타입 생략 가능 
		
	}
	
}