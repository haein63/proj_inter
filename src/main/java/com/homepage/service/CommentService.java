package com.homepage.service;

import com.homepage.dto.Comments;

public interface CommentService {
	int insert(Comments comments);
	int delete(int commentNo);
	
}
