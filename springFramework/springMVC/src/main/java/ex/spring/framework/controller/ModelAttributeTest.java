package ex.spring.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ex.spring.framework.domain.TestVO;

@Controller
public class ModelAttributeTest {

	@GetMapping("model-attribute-param")
	public String modelAttributeParamPage(@ModelAttribute("param") TestVO param) throws Exception {

		param.setStr("param");
		param.setNum(111);
		
		return "test/model-attribute";
	}
	
	@GetMapping("model-attribute-method")
	public String modelAttributeMethodPage(Model model) throws Exception {
	
		model.addAttribute("result", this.data());
		
		return "test/model-attribute";
	}
	
	@ModelAttribute("method")
	public TestVO data() {
		
		final TestVO vo = new TestVO();
		
		vo.setStr("method");
		vo.setNum(999);
		
		return vo;
	}
	
}