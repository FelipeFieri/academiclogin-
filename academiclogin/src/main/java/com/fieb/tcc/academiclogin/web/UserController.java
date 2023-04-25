package com.fieb.tcc.academiclogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fieb.tcc.academiclogin.model.User;
import com.fieb.tcc.academiclogin.service.UserService;
import com.fieb.tcc.academiclogin.web.dto.UserDto;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ModelAttribute("user")
	public UserDto userDto() {
		return new UserDto();
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/users/home")
	public String home(Model model) {
		
		String username = userService.getAuthenticatedUser().getEmail();
		model.addAttribute("username", username);		
		return "index";
	}
	
	@GetMapping("/users/perfil/{username}")
	public String showPerfilForm(@PathVariable("username") String username, ModelMap model) {
		UserDto userDto = new UserDto();
		userDto.setEmail(username);
		User user = userService.findByEmail(userDto);
		model.addAttribute("user", user);
		return "update-registration";
	}
	@PostMapping("/users/perfil")
	public String updatePerfilAccount(@ModelAttribute("user")UserDto userDto) {
		User user = userService.update(userDto);
		return "redirect:/users/perfil/" + user.getEmail();
	}

}
