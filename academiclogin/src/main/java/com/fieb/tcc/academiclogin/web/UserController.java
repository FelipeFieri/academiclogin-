package com.fieb.tcc.academiclogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(){
		
		return "login";
		
	}

	@GetMapping("/users/home")
	public String home() {
		return "index";
	}
	
}
