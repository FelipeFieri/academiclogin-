package com.fieb.tcc.academiclogin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fieb.tcc.academiclogin.model.Role;
import com.fieb.tcc.academiclogin.service.UserService;

@SpringBootApplication
public class AcademicloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicloginApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role("ROLE_USER"));
			userService.saveRole(new Role("ROLE_ADMIN"));
			userService.saveRole(new Role("ROLE_INSTRUCTOR"));
			userService.saveRole(new Role("ROLE_STUDENT"));	
			
		};
	}
	
}
