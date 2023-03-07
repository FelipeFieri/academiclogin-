package com.fieb.tcc.academiclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fieb.tcc.academiclogin.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User , Long> {

	User findByEmail(String email);
	
}
