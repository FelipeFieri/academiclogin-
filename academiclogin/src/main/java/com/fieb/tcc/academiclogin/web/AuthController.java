package com.fieb.tcc.academiclogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fieb.tcc.academiclogin.service.UserService;
import com.fieb.tcc.academiclogin.web.dto.UserDto;

@Controller
public class AuthController {
	
	
	private UserService userService;
	
	public AuthController(UserService userService) {
		
		this.userService = userService;
	}
	
	
	@ModelAttribute("user")
	public UserDto userDto() {
		return new UserDto();
	}
	
	@GetMapping("/registration")
	public String showRegistrationForm() {
		return "registration";
	}
	
	
	@PostMapping("/registration")
	public String registerUserAccount(@ModelAttribute("user") UserDto userDto) {
		userService.save(userDto);
		return "redirect:/registration?success";
	}

}