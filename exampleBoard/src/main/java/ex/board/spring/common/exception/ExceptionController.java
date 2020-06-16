package ex.board.spring.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String error404(NoHandlerFoundException e, Model model) {

		model.addAttribute("error", "404");
		
		return "/404";
	}

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String error400(IllegalArgumentException e, Model model) {

		model.addAttribute("error", "404");
		
		return "/404";
	}
	
	@ExceptionHandler(PageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String pageNotFoundException(PageNotFoundException e, Model model) {

		model.addAttribute("error", e.getMessage());

		return "404";
	}
	
}