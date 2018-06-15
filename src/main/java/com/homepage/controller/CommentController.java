package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homepage.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService coms;
	
	
	@GetMapping(value="/comment")
	public String comment(Model model) {
		return "comment";
	}
	
	/*@PostMapping(value="insertkey")
	public String insert(@RequestParam id, ) {
		coms.insertCmt(comments);
		
		return "insertResult";
	}*/
}
