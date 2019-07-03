package com.wcs.app.sb.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping(value="/")
	public String m1() {
		
		return "hello";
	}
	

}
