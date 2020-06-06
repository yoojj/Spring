package ex.spring.framework.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import ex.spring.framework.domain.TestVO;

@Controller
public class ResponseBodyTest {

	@GetMapping("response-body")
	public String responseBodyPage() throws Exception {
		return "test/response-body";
	}

	@PostMapping("api.httpResponse")
	public void useHttpResponse(HttpServletResponse response) throws Exception {

		final TestVO vo = new TestVO();

		vo.setObj(Arrays.asList(1,2,3));
		vo.setStr("HttpServletResponse");
		vo.setNum(111);
		
		final ObjectMapper mapper = new ObjectMapper();
		
		final String json = mapper.writeValueAsString(vo);

		response.getWriter().print(json);
		
	}
	
	@PostMapping("api.responseBody")
	@ResponseBody
	public Object useResponseBody() throws Exception {

		final TestVO vo = new TestVO();

		vo.setObj(Arrays.asList(1,2,3));
		vo.setStr("@ResponseBody");
		vo.setNum(999);
		
		return vo;
		
	}
	
}