package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@RequestMapping("/test")
	@ResponseBody
	public String show() {
		return "this is spring boot";
	}
	
	@RequestMapping("/home")
	public String showhome() {
		return "home";
	}
}
