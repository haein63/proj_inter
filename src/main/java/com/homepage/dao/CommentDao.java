package com.homepage.dao;

import com.homepage.dto.Comments;

public interface CommentDao {
	int insert(Comments comments);
	int delete(int commentNo);
}
