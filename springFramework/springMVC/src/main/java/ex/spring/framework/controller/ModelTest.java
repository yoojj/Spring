package ex.spring.framework.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelTest {

	@GetMapping("model")
	public String modelPage(Model model) throws Exception {

		// Model 
		// : 인터페이스 
		
		model.addAttribute("title", "Model");

		model.addAttribute("result", "model");
		
		final Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		  
		model.mergeAttributes(map);
		
		return "test/model";
	}
	
	@GetMapping("model-map")
	public String modelMapPage(ModelMap map) throws Exception {

		// ModelMap
		// : Model 인터페이스를 구현한 클래스
		
		map.addAttribute("title", "ModelMap");

		map.addAttribute("result", "modelMap");

		map.addAttribute("key", "value");
		
		return "test/model";
	}
	
	@GetMapping("model-and-view")
	public ModelAndView modelAndViewPage(ModelAndView model) throws Exception {
		
		model.addObject("title", "ModelAndView");
		
		model.addObject("result", "modelAndview");
	
		model.addObject("key", "value");
				
		model.setViewName("test/model");
		
		return model;
	}
	
}