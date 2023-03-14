package com.fieb.tcc.academiclogin.web.dto;

public class UserDto {
private Long id;
private String lastName;	
private String firstName;	
private String email;	
private String password;

public UserDto() {
	
	
	
}

public UserDto(Long id, String lastName, String firstName, String email, String password) {
	
	this.id = id;
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
	this.password = password;
}

public UserDto(String lastName, String firstName, String email, String password) {
	
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
	this.password = password;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
