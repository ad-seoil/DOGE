package com.project.doge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "Hello World";	// 다른 페이지로 보내기 redirect
	}
}
