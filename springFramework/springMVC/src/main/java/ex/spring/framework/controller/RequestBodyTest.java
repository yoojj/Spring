package ex.spring.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ex.spring.framework.domain.TestVO;

@Controller
public class RequestBodyTest {

	@RequestMapping(value = "request-body", method = {RequestMethod.GET, RequestMethod.POST}, consumes="*")
	public String requestBody(@RequestBody(required=false) String param, Model model) throws Exception {
	
		// @RequestBody
		// : HTTP POST 방식으로 전달 받은 데이터를 파라미터로 전달하고 
		//   HttpMessageConverter를 통해 객체로 변환-역직렬화   
		
		//  consumes - Consumable media types 
		//  produces - Producible media types
		
		model.addAttribute("result", param);
		
		return "test/request-body";
	}
	
	@PostMapping("request-body-obj")
	@ResponseBody
	public ModelAndView requestBody(TestVO vo, ModelAndView model) throws Exception {
		
		// form element 
		// : content type = application/x-www-form-urlencoded
		// : key=value&key=value
		
		model.addObject("result", vo);
		model.setViewName("test/request-body");
		
		return model;
	}
	
}