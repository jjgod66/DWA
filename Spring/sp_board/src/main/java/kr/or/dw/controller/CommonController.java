package kr.or.dw.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

	@GetMapping("/common/loginForm")
	public String loginForm(HttpServletResponse rest) throws Exception {
		String url = "/common/loginForm";
		
		return url;
	}
}
