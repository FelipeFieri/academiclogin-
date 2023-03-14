package com.fieb.tcc.academiclogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.fieb.tcc.academiclogin.model.User;
import com.fieb.tcc.academiclogin.web.dto.UserDto;



public interface UserService extends UserDetailsService {

User save(UserDto userDto);
User findByEmail(UserDto userDto);
User update(User user);



	
}