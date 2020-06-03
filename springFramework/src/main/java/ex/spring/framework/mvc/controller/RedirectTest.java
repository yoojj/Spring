package ex.spring.framework.mvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectTest {

	@GetMapping("redirect-response")
	public void httpServletResponseRedirect(HttpServletResponse response) throws Exception {
		
		// 방법1
		response.setHeader("Location", "http://google.co.kr");
		response.setStatus(HttpServletResponse.SC_FOUND);
		
		// 방법2
		//response.sendRedirect("/");	
		
	}
	
	@GetMapping("redirect")
	public String redirect() throws Exception {
		return "redirect:/";
	}
	
	@GetMapping("redirect-modelandview")
	public ModelAndView redirect(ModelMap model) throws Exception {
		
		model.addAttribute("result", "ModelAndView");
		
		return new ModelAndView("redirect:/", model);
	}
	
	@GetMapping("redirect-view")
	public RedirectView redirectView() throws Exception {
		
		final RedirectView redirect = new RedirectView();
		
		redirect.setUrl("/");
		redirect.addStaticAttribute("result", "RedirectView");
		
		return redirect;
	}
	
	@GetMapping("redirect-attributes")
	public String redirectAttributes(RedirectAttributes redirect) throws Exception {
		
		redirect.addFlashAttribute("result", "RedirectAttributes");

		return "redirect:/";
	}
	
}