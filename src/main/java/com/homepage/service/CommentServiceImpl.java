package com.homepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.CommentDao;
import com.homepage.dto.Comments;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao cdao;
	@Override
	public int insert(Comments comments) {
		int result = cdao.insert(comments);
		return result;
	}

	@Override
	public int delete(int commentNo) {
		int result = cdao.delete(commentNo);
		return result;
	}

}
