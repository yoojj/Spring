package ex.spring.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestMappingTest {
	
	// @RequestMapping
	// @RequestMapping(value="", headers="", method=RequestMethod.GET, produces="")
	// : 클라이언트 요청과 매핑될 클래스나 메소드를 지정하는 어노테이션  
	

	// Spring 4.3
	// - @GetMapping
	// - @PostMapping
	// - @PutMapping
	// - @DeleteMapping
	// - @PatchMapping
	
	

	// 요청 경로와 jsp 파일명이 일치하면 메소드 리턴 타입 생략 가능
	@GetMapping(value="index")
	public void indexPage(Model model) throws Exception {
		
		model.addAttribute("result", "index");
	}
	
	@GetMapping(value={"/", "main"})
	public String defaultPage(Model model) throws Exception {
		
		model.addAttribute("result", "default");
		
		return "index";
	}
	
}