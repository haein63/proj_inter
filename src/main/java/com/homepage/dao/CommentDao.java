package com.homepage.dao;

import com.homepage.dto.Comments;

public interface CommentDao {
	int insertCmt(Comments comments);
	int deleteCmt(int commentNo);
}
