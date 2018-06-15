package com.homepage.service;

import com.homepage.dto.Comments;

public interface CommentService {
	int insertCmt(Comments comments);
	int deleteCmt(int commentNo);
	
}
