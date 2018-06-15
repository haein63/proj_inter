package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homepage.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService com;
	
	/*@PostMapping(value="insertkey")
	public String insert(@RequestParam id, ) {
		coms.insert(comments);
		
		return "insertResult";
	}*/
}
