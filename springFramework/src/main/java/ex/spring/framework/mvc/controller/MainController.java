package ex.spring.framework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value={"/", "index", "main"})
	public String main(Model model) throws Exception {
		return "main";
	}
	
}