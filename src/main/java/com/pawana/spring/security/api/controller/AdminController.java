package com.pawana.spring.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pawana.spring.security.api.model.User;
import com.pawana.spring.security.api.repository.UserRepository;

@RestController
public class AdminController {
	@Autowired
	private UserRepository userRepository; 
	//we  dont want to save the password in text as we are giving
	//to make it encrypt use BcryptPassworsEncoder
	// for this create a bean in configuration file
	@Autowired
	private BCryptPasswordEncoder passWordEncoder;
	
	public String addUserByAdmin(@RequestBody User user) {
		userRepository.save(user);
		return "user added successfully...";
		
	}

}
