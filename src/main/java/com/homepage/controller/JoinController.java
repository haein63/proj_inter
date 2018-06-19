package com.homepage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homepage.dto.Users;

@Controller
public class JoinController {
	
	@RequestMapping("/join")
	public String join() {
		return "join/joinForm";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/join/joinForm")
	public String joinForm(HttpServletRequest httpServletRequest, @ModelAttribute("member") Users members) {
		String id = httpServletRequest.getParameter("id");
		String password = httpServletRequest.getParameter("password");
		 
		return "join/joinComplete";
	}
	
}
