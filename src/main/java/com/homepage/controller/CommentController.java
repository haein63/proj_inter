package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homepage.dto.Comments;
import com.homepage.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService com;
	
	
	@GetMapping(value="/comment")
	public String comment(Model model) {
		return "comment";
	}
	
	@PostMapping(value="/insertkey")
	public String insert(@RequestParam(value="userId") String userId,
			@RequestParam(value="comment") String comment,
			@RequestParam(value="title") String title,
			@RequestParam(value="no") int no,
			@RequestParam(value="rating") int rating,
			Model model
			) {
		Comments comments = null;
		comments.setCommentContent(comment);
		comments.setMusicalTitle(title);
		comments.setCommentNo(no);
		comments.setUserId(userId);
		comments.setCommentRating(rating);
		System.out.println("확인1");
		int result = coms.insertCmt(comments);
		System.out.println("확인2");
		System.out.println(result);
		model.addAttribute("result", result);
		return "comment";
	}
}
