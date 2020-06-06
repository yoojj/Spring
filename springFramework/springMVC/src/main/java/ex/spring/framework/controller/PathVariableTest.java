package ex.spring.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableTest {

	@GetMapping(value = {"path-variable", "path-variable/{var}"})
	public String pathVariable(@PathVariable(required=false) String var, Model model) 
			throws Exception {

		model.addAttribute("result", var);
		
		return "test/path-variable";
	}
	
}