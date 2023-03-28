package com.fieb.tcc.academiclogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fieb.tcc.academiclogin.model.User;
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
	
	@ResponseBody
	@RequestMapping(value="/registration/ajax/getEmail/{campo}/{valor}")
	public String getSearchResultViaAjaxRegister(@PathVariable("campo") String campo,
			                                     @PathVariable("valor") String valor) {
		
		String msg= "";
		UserDto userDto = new UserDto();
		userDto.setEmail(valor);
		User user = userService.findByEmail(userDto);
		if(user != null) {
			msg = "Email já existe, escolha um email válido!";
		}
		return msg;
	}

}