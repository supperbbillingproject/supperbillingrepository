package com.cjc.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control1 {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/reg")
	public String registration() {
		return "index";
	}
	@RequestMapping("/log")
	public String login() {
		return"success";
	}
	
}
