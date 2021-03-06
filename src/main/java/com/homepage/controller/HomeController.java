package com.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/include/header")
	public String header() {
		return "/include/header";
	}
	
	@RequestMapping(value="/include/footer")
	public String footer() {
		return "/include/footer";
	}
	
	@RequestMapping(value="/main")
	public String main() {
		return "main";
	}
	

}
