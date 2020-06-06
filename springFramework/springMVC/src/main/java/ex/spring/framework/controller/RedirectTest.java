package ex.spring.framework.controller;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectTest {

	@GetMapping("redirect-response")
	public void httpServletResponseRedirect(HttpServletResponse response) throws Exception {
		
		// 방법1
		//response.setHeader("Location", "/");
		//response.setStatus(HttpServletResponse.SC_FOUND);
		
		// 방법2
		//response.sendRedirect("/");	
		
		// 방법3
		response.setContentType("text/html");
		response.getWriter().write("<script>alert('HttpServletResponse'); location.replace('/');</script>");
		
	}
	
	@GetMapping("redirect")
	public String redirect(Model model) throws Exception {
		
		model.addAttribute("redirect", "redirect");
		
		return "redirect:/";
	}
	
	@GetMapping("redirect-modelandview")
	public ModelAndView redirect(ModelAndView model) throws Exception {
		
		model.setViewName("redirect:/");
		model.addObject("redirect", "ModelAndView");

		return model;
	}
	
	@GetMapping("redirect-view")
	public RedirectView redirectView(RedirectView redirect) throws Exception {

		redirect.setUrl("/");
		redirect.addStaticAttribute("redirect", "RedirectView");
		
		return redirect;
	}
	
	@GetMapping("redirect-attributes")
	public String redirectAttributes(RedirectAttributes redirect) throws Exception {
		
		redirect.addFlashAttribute("redirect", "RedirectAttributes");

		return "redirect:/";
	}
	
}