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
	public void insertCmt(Comments comments) {
		System.out.println("ser>>>>>>"+comments.toString());
		cdao.insertCmt(comments);
	}
	
	@Override
	public void updateCmt(Comments comments) {
		
	}
	
	@Override
	public int deleteCmt(int commentNo) {
		int result = cdao.deleteCmt(commentNo);
		return result;
	}

	

}
