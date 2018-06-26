package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.homepage.dto.Users;
import com.homepage.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public String loginForm(Model model) {
		return "loginForm";
	}
	
	@PostMapping("/loginkey")
	public String login(Users user, Model model) {
		System.out.println("확인>>>>>>>"+user.getId());
		System.out.println("확인>>>>>>>"+user.getPassword());
		Users user1 = service.login(user);
		
		user1.getPassword();
		model.addAttribute("User",user1);
		return "loginResult";
	}
	

}
