package com.example.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bankapp.model.Users;
import com.example.bankapp.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
