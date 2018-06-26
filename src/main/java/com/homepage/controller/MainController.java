package com.homepage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.homepage.dto.Musical;
import com.homepage.service.MusicalService;


@Controller
public class MainController {
	
	

	private static Logger mylog = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	MusicalService service;
	
	@GetMapping("/mainTest")
	public String currentMusical(Model model) {
		return "mainTest";
	}
	
	@PostMapping(value="/mainTest", produces="text/html; charset=utf-8")
	public @ResponseBody String movie(Model model, @RequestParam String title) {
		Musical result = service.getMusicals(title);
		mylog.info("뮤지컬 정보:{}", result);
		model.addAttribute("result", result.toString()+"<br>되냐...");
		return "result";
		
	}
	

}
