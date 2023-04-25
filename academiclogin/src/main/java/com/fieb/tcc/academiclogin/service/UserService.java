package com.fieb.tcc.academiclogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.fieb.tcc.academiclogin.model.Role;
import com.fieb.tcc.academiclogin.model.User;
import com.fieb.tcc.academiclogin.web.dto.UserDto;



public interface UserService extends UserDetailsService {
	
	User save(UserDto userDto);
	User findByEmail(UserDto userDto);
	User update(User user);
	
	User getAuthenticatedUser();
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User update(UserDto userDto);

}