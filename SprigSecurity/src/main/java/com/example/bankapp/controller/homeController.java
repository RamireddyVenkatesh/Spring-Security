package com.example.bankapp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class homeController 
{
	@GetMapping("/")
	public String homePage(HttpServletRequest request) {
		return "Welcome spring security" + request.getSession().getId();
	}
}
