package ex.board.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/", "index", "main"})
	public String indexPage() {
		return "index";
	}
	
}