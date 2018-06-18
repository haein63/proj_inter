package com.homepage.service;

import com.homepage.dto.Comments;

public interface CommentService {
	void insertCmt(Comments comments);
	void updateCmt(Comments comments);
	int deleteCmt(int commentNo);
	
}
