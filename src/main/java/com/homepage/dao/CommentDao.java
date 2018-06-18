package com.homepage.dao;

import com.homepage.dto.Comments;

public interface CommentDao {
	void insertCmt(Comments comments);
	
	int deleteCmt(int commentNo);
}
