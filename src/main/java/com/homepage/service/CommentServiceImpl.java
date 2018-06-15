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
	public int insertCmt(Comments comments) {
		int result = cdao.insertCmt(comments);
		return result;
	}

	@Override
	public int deleteCmt(int commentNo) {
		int result = cdao.deleteCmt(commentNo);
		return result;
	}

}
