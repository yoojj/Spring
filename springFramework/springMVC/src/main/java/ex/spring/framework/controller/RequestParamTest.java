package ex.spring.framework.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamTest {

	@GetMapping("request-param")
	public String requestParam(@RequestParam(required=false, defaultValue="") String param, Model model) 
			throws Exception {
	
		model.addAttribute("result", param);
		
		return "test/request-param";
	}

	@GetMapping("request-param-list")
	public String requestParamList(@RequestParam(required=false) List<Object> param, Model model) 
			throws Exception {
	
		// localhost:8080/request-param-list?param=1,2,3,4,5

		model.addAttribute("result", param);
		
		return "test/request-param";
	}
	
	@GetMapping("request-param-map")
	public String requestParamMap(@RequestParam(required=false) Map<String, Object> param, Model model) 
			throws Exception {
	
		// localhost:8080/request-param-map?str=abc&int=1

		model.addAttribute("result", param.entrySet());
		
		return "test/request-param";
	}

}